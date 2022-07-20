package com.rakovets.course.java.core.practice.jcf_collection.list;

public class Actor implements Comparable<Actor> {
    private String firstName;
    private String lastName;
    private Integer fee;
    private Integer age;

    public Actor(String firstName, String lastName, Integer fee, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
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

    @Override
    public int compareTo(Actor o) {
        if (this.fee > o.getFee()) {
            return -1;
        } else if (this.fee < o.getFee()) {
            return 1;
        } else {
            return 0;
        }

    }

    public Integer getFee() {
        return fee;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }
}
