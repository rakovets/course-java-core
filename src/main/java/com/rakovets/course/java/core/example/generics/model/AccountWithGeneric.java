package com.rakovets.course.java.core.example.generics.model;

public class AccountWithGeneric<T> {
    private final T id;
    private int sum;

    public AccountWithGeneric(T id) {
        this.id = id;
    }

    public AccountWithGeneric(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
