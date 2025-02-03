package com.example.testcase3;

import java.util.UUID;

public class WalletOperationRequest {

    private UUID walletId;
    private double amount;
    private boolean isDeposit;

    public UUID getWalletId() {
        return walletId;
    }

    public void setWalletId(UUID walletId) {
        this.walletId = walletId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isDeposit() {
        return isDeposit;
    }

    public void setDeposit(boolean deposit) {
        isDeposit = deposit;
    }

    public enum OperationType {
        DEPOSIT, WITHDRAW
    }
}
