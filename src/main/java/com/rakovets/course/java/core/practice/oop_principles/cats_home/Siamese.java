package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat {
    Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "miw-miw";
    }

    @Override
    public String purr() {
        return "pr-pr";
    }
}
