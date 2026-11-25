package com.shashank.githubactions.app;

public class BankAccount {

    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Deposit amount must be positive");
        }

        balance += amount;
    }

    public void withdraw(int amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal amount must be positive");
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Insufficient balance");
        }

        balance -= amount;
    }
}
