package com.example.testcase3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/wallets")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @PostMapping("/{walletId}/operation")
    public ResponseEntity<String> processOperation(
            @PathVariable UUID walletId,
            @RequestParam double amount,
            @RequestParam boolean isDeposit) {

        walletService.processOperation(walletId, amount, isDeposit);
        return ResponseEntity.ok("Операция выполнена успешно"); // возвращаем двухсотый статус код
    }

    @GetMapping("/{walletId}/balance")
    public ResponseEntity<Double> getBalance(@PathVariable UUID walletId) {
        double balance = walletService.getBalance(walletId);
        return ResponseEntity.ok(balance); // тоже самое
    }
}
