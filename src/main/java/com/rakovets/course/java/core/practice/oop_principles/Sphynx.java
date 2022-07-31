package com.rakovets.course.java.core.practice.oop_principles;

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
}
