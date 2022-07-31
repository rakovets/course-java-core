package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private String name;

    public Cat (String name) {
        this.name = name;
    }

    public String mew() {
        return "mew";
    }

    public String purr() {
        return "purr";
    }

    public void mew(Person user) {
        user.changeHappiness(-10);
    }

    public void purr(Person user) {
        user.changeHappiness(+10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
