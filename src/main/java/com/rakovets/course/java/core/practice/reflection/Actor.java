package com.rakovets.course.java.core.practice.reflection;

public class Actor {
    private String name;

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name=" + name +
                '}';
    }
}
