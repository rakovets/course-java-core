package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {
    Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "meeaaw";
    }

    @Override
    public String purr() {
        return "pppuurr";
    }

    @Override
    public String mew (Person user) {
        user.changeHappiness(-12);
        return "meeaaw. Master, Sphynx wants to eat!";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(+12);
        return "pppuurr. Sphynx is happy!";
    }
}
