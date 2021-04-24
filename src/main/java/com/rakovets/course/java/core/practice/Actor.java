package com.rakovets.course.java.core.practice;

public class Actor {
    private final String firstName;
    private final String lastName;
    private final double fee;
    private final int age;

    public Actor(String firstName, String lastName, double fee, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getFee() {
        return fee;
    }
}
