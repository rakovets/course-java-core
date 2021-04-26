package com.rakovets.course.java.core.practice.jcf_list.studio;

public class Actor implements Comparable {
    private String firstName;
    private String lastName;
    private double fee;
    private int age;

    public Actor(String firstName) {
        this.firstName = firstName;
    }

    public Actor(String firstName, String lastName, double fee, int age) {
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

    public double getFee() {
        return fee;
    }

    public int getAge() {
        return age;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "First name='" + firstName + '\'' +
                ", Last name='" + lastName + '\'' +
                ", Fee=" + fee +
                ", Age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Actor actor = (Actor) o;
        return Double.compare(this.getFee(), actor.getFee());
    }
}
