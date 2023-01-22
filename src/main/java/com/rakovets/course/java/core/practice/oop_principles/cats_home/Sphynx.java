package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {
    public Sphynx() {
    }

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mew-Mew-Mew-Mew";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-4);
        return "Mew-Mew-Mew-Mew";
    }

    @Override
    public String purr() {
        return "Purr-Purr-Purr-Purr";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(4);
        return "Purr-Purr-Purr-Purr";
    }
}
