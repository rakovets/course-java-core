package com.rakovets.course.java.core.practice.jcf_list.studio;
import java.util.Objects;

public class Actor {
    private String firstName;
    private String lastName;
    private int fee = 0;
    private int age = 0;
    public Actor(String firstName, String lastName, int fee, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + fee + " " + age;
    }
    public int getFee() {
        return fee;
    }
    public int getAge() {
        return age;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
}
