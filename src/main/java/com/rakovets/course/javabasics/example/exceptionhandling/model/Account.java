package com.rakovets.course.javabasics.example.exceptionhandling.model;

import com.rakovets.course.javabasics.example.exceptionhandling.exception.AccountExpiredException;

public class Account {
    private double amount;
    private boolean isExpired = true;

    public void takeCash(int amount) throws AccountExpiredException {
        System.out.println("Start processing request!");
        if (isExpired) {
            throw new AccountExpiredException("Account is expired", "Time to life: wrong");
        } else if (this.amount < amount) {
            throw new AccountExpiredException("No money on the account");
        } else {
            this.amount -= amount;
        }
        System.out.println("Finish processing request!");
    }
}
