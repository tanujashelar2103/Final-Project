package com.atm;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0.0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
