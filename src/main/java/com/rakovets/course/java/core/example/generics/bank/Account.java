package com.rakovets.course.java.core.example.generics.bank;

public class Account<T> {
    private T id;
    private String fullName;

    public Account(T id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
