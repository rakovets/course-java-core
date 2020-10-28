package com.rakovets.course.javabasics.example.generics.model;

public class Actor {
    private String firstName;
    private String lastName;
    private int fee;
    private int age;

    public Actor(String firstName, String lastName, int fee, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public int getFee() {
        return fee;
    }

    public void setFee() {
        this.fee = fee;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }
}
