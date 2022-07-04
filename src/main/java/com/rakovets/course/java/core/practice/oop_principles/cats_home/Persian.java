package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat {
    Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "miaow-miaow";
    }

    @Override
    public String purr() {
        return "mr-mr";
    }
}
