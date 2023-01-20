package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "mew";
    }

    public String mew(Person user) {
        user.changeHappiness(-5);
        return "mew";
    }

    public String pur() {
        return "pur";
    }

    public String pur(Person user) {
        user.changeHappiness(5);
        return "pur";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
