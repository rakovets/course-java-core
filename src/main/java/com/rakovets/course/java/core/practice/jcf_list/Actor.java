package com.rakovets.course.java.core.practice.jcf_list;

public class Actor {
    private String firstname;
    private String lastname;
    private int fee;
    private int age;

    public Actor(String firstname, String lastname, int fee, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.fee = fee;
        this.age = age;
    }

    public String getFirstname() {
        return  firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getFee() {
        return fee;
    }

    public int getAge() {
        return age;
    }
}
