package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Objects;

public class Actor {
    private final String firstName;
    private final String lastName;
    private final double fee;
    private final int age;

    /**
     * Constructor.
     *
     * @param firstName actor's name.
     * @param lastName  actor's surname.
     * @param fee       actor's fee.
     * @param age       actor's age.
     */
    public Actor(String firstName, String lastName, double fee, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Actor actor = (Actor) o;
        return Double.compare(actor.fee, fee) == 0 && age == actor.age
                && firstName.equals(actor.firstName) && lastName.equals(actor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, fee, age);
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

    public double getFee() {
        return fee;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
