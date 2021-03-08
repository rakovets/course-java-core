package com.rakovets.course.java.core.practice.reflection;

public class ModelClass {
    private String name;
    private int age;
    protected char symbol;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void incrementAge() {
        this.age++;
    }

    public int getAge() {
        return age;
    }

    public ModelClass(String name, int age, char symbol) {
        this.name = name;
        this.age = age;
        this.symbol = symbol;
    }
}
