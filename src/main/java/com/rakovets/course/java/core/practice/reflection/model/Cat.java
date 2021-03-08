package com.rakovets.course.java.core.practice.reflection.model;

public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String purr() {
        return "purr";
    }

    public String feed(String food) {
        return purr() + " for " + food;
    }

    private void updateAge() {
        this.age++;
    }

    public int getAge() {
        return age;
    }
}
