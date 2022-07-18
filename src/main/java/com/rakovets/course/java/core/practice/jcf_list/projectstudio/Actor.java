package com.rakovets.course.java.core.practice.jcf_list.projectstudio;

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

    public int getFee() {
        return this.fee;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }
}
