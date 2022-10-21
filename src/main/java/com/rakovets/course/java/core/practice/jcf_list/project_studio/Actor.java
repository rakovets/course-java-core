package com.rakovets.course.java.core.practice.jcf_list.project_studio;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fee=" + fee +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Double.compare(actor.fee, fee) == 0 && age == actor.age && firstName.equals(actor.firstName) && lastName.equals(actor.lastName);
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
}
