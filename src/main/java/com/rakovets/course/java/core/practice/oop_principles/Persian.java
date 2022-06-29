package com.rakovets.course.java.core.practice.oop_principles;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meow like Persian";
    }

    @Override
    public String purr() {
        return "Purr like Persian";
    }
}
