package com.rakovets.course.java.core.practice.jcf_list;

public class Actor {
    private final String firstName;
    private final String lastName;
    private final float fee;
    private final int age;

    public Actor(String firstName, String lastName, float fee, int age) {
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

    public float getFee() {
        return fee;
    }

    public int getAge() {
        return age;
    }
}
