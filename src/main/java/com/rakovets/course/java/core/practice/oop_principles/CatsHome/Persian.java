package com.rakovets.course.java.core.practice.oop_principles.CatsHome;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meowwwwwwwww.";
    }

    @Override
    public String purr() {
        return "purrrrrrrr";
    }
}
