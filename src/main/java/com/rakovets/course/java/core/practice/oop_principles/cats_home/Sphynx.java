package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {
    Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mio-mio";
    }

    @Override
    public String purr() {
        return "mur-mur";
    }
}
