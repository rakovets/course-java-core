package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Objects;

public class Actor implements Comparable<Actor> {
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Integer fee;

    public Actor(String firstName, String lastName, Integer age, Integer fee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.fee = fee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(firstName, actor.firstName) && Objects.equals(lastName, actor.lastName)
                && Objects.equals(age, actor.age) && Objects.equals(fee, actor.fee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, fee);
    }

    @Override
    public int compareTo(Actor actor) {
        return fee.compareTo(actor.getFee());
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

    public int getFee() {
        return fee;
    }
}
