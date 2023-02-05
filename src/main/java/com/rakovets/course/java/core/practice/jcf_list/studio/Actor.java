package com.rakovets.course.java.core.practice.jcf_list.studio;

public class Actor {
    private final String firstName;
    private final String lastName;
    private final Integer getFee;
    private final Integer age;

    public Actor(String firstName, String lastName, Integer fee, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.getFee = fee;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getFee() {
        return getFee;
    }

    public Integer getAge() {
        return age;
    }
}
