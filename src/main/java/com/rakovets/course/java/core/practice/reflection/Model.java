package com.rakovets.course.java.core.practice.reflection;

public class Model {
    private String name;
    private int age;

    public Model(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String getName() {
        return name;
    }
}
