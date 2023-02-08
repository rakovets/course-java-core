package com.rakovets.course.java.core.practice.jcf_list.studio;

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
