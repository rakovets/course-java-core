package com.rakovets.course.javabasics.example.generictypes.model;

public class LongBankAccount extends BankAccount {
    long id;

    public LongBankAccount(String name, String surname) {
        super(name, surname);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
