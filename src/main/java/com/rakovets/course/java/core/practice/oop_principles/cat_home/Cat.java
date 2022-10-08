package com.rakovets.course.java.core.practice.oop_principles.cat_home;

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

    public void mew(Person user) {
        user.changeHappiness(-3);
    }

    public void purr(Person user) {
        user.changeHappiness(3);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
