package com.rakovets.course.java.core.practice.jcf_list.Studio.Models;

public class Actor {
    private final String firstName;
    private final String lastName;
    private final double fee;
    private int age;

    public Actor(String firstName, String lastName, double fee, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor {" + "full name: " + firstName + " " + lastName + " fee: " + fee + " age: " + age + "}";
    }
}
