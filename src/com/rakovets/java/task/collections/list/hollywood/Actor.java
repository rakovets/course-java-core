package com.rakovets.java.task.collections.list.hollywood;

public class Actor {
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

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fee=" + fee +
                ", age=" + age +
                '}';
    }
}
