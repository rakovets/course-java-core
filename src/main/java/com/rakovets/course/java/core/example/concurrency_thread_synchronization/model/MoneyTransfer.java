package com.rakovets.course.java.core.example.concurrency_thread_synchronization.model;

public class MoneyTransfer implements Runnable {
    private final BankAccount from, to;
    private final double amount;

    public MoneyTransfer(BankAccount from, BankAccount to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void run() {
        from.transfer(amount, to);
    }
}
