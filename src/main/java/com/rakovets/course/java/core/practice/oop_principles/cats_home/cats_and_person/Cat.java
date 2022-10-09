package com.rakovets.course.java.core.practice.oop_principles.cats_home.cats_and_person;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "Mew";
    }

    public double mew(Person user) {
        return user.changeHappiness(-5.0);
    }

    public String purr() {
        return  "Purr";
    }

    public double purr(Person user) {
        return user.changeHappiness(5.0);
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
}
