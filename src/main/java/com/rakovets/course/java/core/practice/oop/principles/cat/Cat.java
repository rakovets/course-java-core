package com.rakovets.course.java.core.practice.oop.principles.cat;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "Mew";
    }

    public String purr() {
        return "Purr";
    }

    public String mew(Person user) {
        user.changeHappiness(-10);
        return "Mew";
    }

    public String purr(Person user) {
        user.changeHappiness(10);
        return "Purr";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
