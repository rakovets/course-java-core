package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends  Cat {
    public Persian() {

    }

    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mew-Mew-Mew";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-3);
        return "Mew-Mew-Mew";
    }

    @Override
    public String purr() {
        return "Purr-Purr-Purr";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(3);
        return "Purr-Purr-Purr";
    }
}
