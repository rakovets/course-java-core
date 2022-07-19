package com.rakovets.course.java.core.practice.jcf_list.studio.actors_and_studio;

public class Actor {
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

    public String getLastName() {
        return lastName;
    }

    public double getFee() {
        return fee;
    }

    public int getAge() {
        return age;
    }
}
