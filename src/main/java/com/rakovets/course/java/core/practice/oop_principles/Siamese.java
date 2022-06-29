package com.rakovets.course.java.core.practice.oop_principles;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meow like Siamese";
    }

    @Override
    public String purr() {
        return "Purr like Siamese";
    }
}
