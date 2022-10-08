package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String catMew() {
        return "mew";
    }

    public String catMew(Person user) {
        user.changeHappiness(-10);
        return "mewmew";
    }

    public String catPurr() {
        return "purr";
    }

    public String catPurr(Person user) {
        user.changeHappiness(10);
        return "pupupurrr";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
