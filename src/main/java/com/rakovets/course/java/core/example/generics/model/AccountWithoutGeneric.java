package com.rakovets.course.java.core.example.generics.model;

public class AccountWithoutGeneric {
    private final Object id;
    private int sum;

    public AccountWithoutGeneric(Object id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public Object getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
