package com.example.testcase3;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private double balance;

    @Version
    private int version; // блокировка параллельных транзакций

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
