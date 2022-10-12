package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Sphynx mews";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-15.0);
        return "Sphynx mews";
    }

    @Override
    public String purr() {
        return "Sphynx purrs";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(30.0);
        return "Sphynx purrs";
    }
}
