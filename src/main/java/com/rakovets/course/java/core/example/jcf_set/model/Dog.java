package com.rakovets.course.java.core.example.jcf_set.model;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
