package com.rakovets.course.java.core.practice.reflection;

public class Template {
    private String name;

    public Template(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printName() {
        System.out.println(name);
    }
}
