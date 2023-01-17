package com.rakovets.course.java.core.practice.oop_principles.catshome;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meow, meow, meow!";
    }

    @Override
    public String purr() {
        return "Murrr...";
    }
}
