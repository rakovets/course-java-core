package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "Mew";
    }

    public String mew(Person user) {
        user.changeHappiness(-1);
        return "Mew";
    }

    public String purr() {
        return "Purr";
    }

    public String purr(Person user) {
        user.changeHappiness(1);
        return "Purr";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
