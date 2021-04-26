package com.rakovets.course.java.core.practice.jcf_list.studio;

public class Actor {
    private String firstName;
    private String lastName;
    private double fee;
    private int age;



    public Actor(String firstName, String lastName, int age, double fee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" + firstName +
                " " + lastName +
                ", age = " + age + "," +
                " fee = " + fee +
                '}' + '\n';
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
