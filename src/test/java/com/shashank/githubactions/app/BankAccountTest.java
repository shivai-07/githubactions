package com.shashank.githubactions.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testInitialBalance() {

        BankAccount account = new BankAccount(1000);

        assertEquals(1000, account.getBalance());
    }

    @Test
    void testDeposit() {

        BankAccount account = new BankAccount(1000);

        account.deposit(500);

        assertEquals(1500, account.getBalance());
    }

    @Test
    void testWithdraw() {

        BankAccount account = new BankAccount(1000);

        account.withdraw(300);

        assertEquals(700, account.getBalance());
    }

    @Test
    void testInsufficientBalance() {

        BankAccount account = new BankAccount(1000);

        assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(1500));
    }
}
