package com.rakovets.course.java.core.example.concurrency_thread_synchronization.model;

public class BankAccount {
    private final String fullName;
    private double balance;

    public BankAccount(String fullName, double balance) {
        this.fullName = fullName;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        balance -= amount;
    }

    public synchronized void transfer(double amount, BankAccount target) {
        System.out.printf("%s is using monitor for object with full name: %s.\n",
                Thread.currentThread().getName(),
                this.getFullName());
        withdraw(amount);

        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("%s want to use monitor for object with full name: %s.\n",
                Thread.currentThread().getName(),
                target.getFullName());
        target.deposit(amount);
    }

    public String getFullName() {
        return fullName;
    }
}
