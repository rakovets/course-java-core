package com.rakovets.course.java.core.practice.reflection;

public class Student {
    private String name;
    private int fee;

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

    public int plusFee(int value) {
        return fee += value;
    }

    public void resetFee() {
        fee = 0;
    }
}
