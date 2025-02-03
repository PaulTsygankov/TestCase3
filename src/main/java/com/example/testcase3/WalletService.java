package com.example.testcase3;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class WalletService {

    @Autowired
    private WalletRepository walletRepository;

    @Transactional  // гарантирует выполнение операции как единое целое
    public void processOperation(UUID walletId, double amount, boolean isDeposit) {

        Wallet wallet = walletRepository.findByIdWithLock(walletId)
                .orElseThrow(() -> new RuntimeException("Кошелек не найден")); //проверка на наличие

        if (isDeposit) {
            wallet.setBalance(wallet.getBalance() + amount); //пополнение
        } else {
            if (wallet.getBalance() < amount) {
                new RuntimeException("Недостаточно средств");
            }
            wallet.setBalance(wallet.getBalance() - amount); // снятие
        }
        walletRepository.save(wallet);

    }

    @Transactional
    public double getBalance(UUID walletId) {
        Wallet wallet = walletRepository.findById(walletId)
                .orElseThrow(() -> new RuntimeException("Кошелек не найден")); //проверка на наличие при запросе баланса

        return wallet.getBalance();
    }
}
