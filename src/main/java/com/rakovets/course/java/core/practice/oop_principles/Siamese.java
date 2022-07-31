package com.rakovets.course.java.core.practice.oop_principles;

public class Siamese extends Cat {
    Siamese (String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mewww";
    }

    @Override
    public String purr() {
        return "pur-r-r";
    }
}
