package com.rakovets.course.java.core.practice.reflection;

public class User {
    private int field;

    public User(int field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "User { " + " field = " + field + " }";
    }
}
