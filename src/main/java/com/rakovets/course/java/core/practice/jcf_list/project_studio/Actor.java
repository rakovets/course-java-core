package com.rakovets.course.java.core.practice.jcf_list.project_studio;

public class Actor {
    private final String firstName;
    private final String lastName;
    private final Integer fee;
    private final Integer age;

    public Actor(String firstName, String lastName, int fee, int age) {
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

    public Integer getFee() {
        return fee;
    }

    public Integer getAge() {
        return age;
    }
}
