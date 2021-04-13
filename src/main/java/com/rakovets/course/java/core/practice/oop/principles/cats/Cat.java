package com.rakovets.course.java.core.practice.oop.principles.cats;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "mew";
    }

    public void mew(Person user) {
        user.changeHappiness(-42);
    }

    public String purr() {
        return "purr";
    }

    public void purr(Person user) {
        user.changeHappiness(25);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
