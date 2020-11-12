package com.rakovets.course.javabasics.list;

public class Actor {
    private String firstName;
    private String lastname;
    private double fee;
    private int age;

    public Actor(String firstName, String lastname, double fee, int age) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.fee = fee;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor " + "FirstName " + firstName +
                ", LastName " + lastname +
                ", Cash=" + fee +
                ", Age=" + age + "\n";
    }

    public String getLastname() {
        return lastname;
    }

    public double getFee() {
        return fee;
    }

    public int getAge() {
        return age;
    }
}
