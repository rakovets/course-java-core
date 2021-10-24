package com.rakovets.course.java.core.example.generics.model;

public class DepositAccount<T> extends AccountWithGeneric<T> {
    public DepositAccount(T id) {
        super(id);
    }
}
