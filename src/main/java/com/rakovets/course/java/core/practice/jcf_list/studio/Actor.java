package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.ArrayList;

public class Actor extends ArrayList {
    private String firstName;
    private String lastName;
    private double fee;
    private int age;

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

    public double getFee() {
        return fee;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Actor {" +
                "First name: " + firstName + "; " +
                "Last name: " + lastName + "; " +
                "Fee: " + fee + "; " +
                "Age: " + age +
                "}";
    }
}
