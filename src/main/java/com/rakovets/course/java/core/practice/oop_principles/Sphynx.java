package com.rakovets.course.java.core.practice.oop_principles;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meow like Sphynx";
    }

    @Override
    public String purr() {
        return "Meow like Sphynx";
    }
}
