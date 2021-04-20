package com.rakovets.course.java.core.practice.jcf_list.studio.model;

public class Actor implements Comparable{
    private String firstName;
    private String lastName;
    private double fee;
    private int age;

    public Actor(String firstName) {
        this.firstName = firstName;
    }

    public Actor(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor(String firstName, String lastName, double fee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
    }

    public Actor(String firstName,String lastName, double fee,int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    public double getFee() {
        return fee;
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
