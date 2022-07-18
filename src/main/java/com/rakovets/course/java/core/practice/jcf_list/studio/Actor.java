package com.rakovets.course.java.core.practice.jcf_list.studio;

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

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + firstName + " " + lastName + '\'' +
                ", cash=" + fee +
                ", age=" + age +
                '}';
    }
}
