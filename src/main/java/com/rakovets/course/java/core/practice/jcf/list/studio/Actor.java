package com.rakovets.course.java.core.practice.jcf.list.studio;

public class Actor implements Comparable<Actor>{
    private String firstName;
    private String lastName;
    private int fee;
    private int age;

    public Actor(String firstName, String lastName, int fee, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    @Override
    public int compareTo(Actor a) {
        if (this.getFee() == a.getFee()) {
            return 0;
        } else if (this.getFee() < a.getFee()) {
            return -1;
        } else if (this.getFee() > a.getFee()) {
            return 1;
        } return 0;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
