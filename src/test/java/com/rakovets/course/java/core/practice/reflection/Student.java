package com.rakovets.course.java.core.practice.reflection;

public class Student {
    private String name;
    private int fee;
    private final int upValueFee = 10;

    public Student(String name, int fee) {
        this.name = name;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }


    public int getFee() {
        return fee;
    }

    public void plusFee() {
        fee += upValueFee;
    }

}
