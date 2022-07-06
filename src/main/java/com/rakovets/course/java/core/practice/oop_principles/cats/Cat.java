package com.rakovets.course.java.core.practice.oop_principles.cats;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    protected String catMeows() {
        return "MEW";
    }

    protected double catMeows(Person user) {
        return user.changeHappiness(-20);
    }

    protected String catPurrs() {
        return "PURR";
    }

    protected double catPurrs(Person user) {
        return user.changeHappiness(+10);
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return name;
    }
}
