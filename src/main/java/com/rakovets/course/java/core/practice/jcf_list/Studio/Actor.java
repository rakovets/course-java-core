package com.rakovets.course.java.core.practice.jcf_list.Studio;

public class Actor {
    private String firstName;
    private String lastName;
    private double fee;
    private int age;

    public Actor (String firstName, String lastName, int fee, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.fee = fee;
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
