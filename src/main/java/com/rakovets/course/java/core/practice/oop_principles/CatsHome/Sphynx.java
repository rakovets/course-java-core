package com.rakovets.course.java.core.practice.oop_principles.CatsHome;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meeeeeeeeee";
    }

    @Override
    public String purr() {
        return "pu";
    }
}
