package com.rakovets.course.java.core.example.io.model;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -1909254337192130771L;

    private final String name;
    private final transient double height;

    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
