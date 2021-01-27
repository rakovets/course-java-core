package com.rakovets.course.java.core.example.exception_handling.model;

import com.rakovets.course.java.core.example.exception_handling.exception.AccountException;

public class Account {
    private double amount;
    private final boolean isExpired;

    public Account(double amount, boolean isExpired) {
        this.amount = amount;
        this.isExpired = isExpired;
    }

    public int takeCash(int amount) throws AccountException {
        System.out.println("Start processing request!");
        if (isExpired) {
            throw new AccountException("Account is expired", "Time to life: wrong");
        } else if (this.amount < amount) {
            throw new AccountException("No money on the account");
        }
        this.amount -= amount;
        System.out.println("Finish processing request!");
        return amount;
    }
}
