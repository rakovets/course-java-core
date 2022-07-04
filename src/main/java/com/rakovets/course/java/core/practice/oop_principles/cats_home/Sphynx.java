package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {
    Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-25);
        return "mio-mio";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(+25);
        return "mur-mur";
    }
}
