package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Objects;

public class Actor {
    private final String firstName;
    private final String lastName;
    private final int fee;
    private final int age;

    public Actor(String firstName, String lastName, int fee, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Actor act = (Actor) o;
        return fee == act.fee && age == act.age && Objects.equals(firstName, act.firstName) && Objects.equals(lastName, act.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, fee, age);
    }

    @Override
    public String toString() {
        return "Actor {" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", fee = " + fee +
                ", age = " + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getFee() {
        return fee;
    }

    public int getAge() {
        return age;
    }
}
