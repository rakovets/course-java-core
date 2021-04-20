package com.rakovets.course.java.core.practice.jcf_list.studio;

public class Actor {
    private String firstname;
    private String lastname;
    private double fee;
    private int age;

    public Actor(String firstname, String lastname, double fee, int age){
        this.age = age;
        this.fee = fee;
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public double getFee() {
        return fee;
    }

    public int getAge() {
        return age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}

