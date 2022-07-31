package com.rakovets.course.java.core.practice.oop_principles;

public class Persian extends Cat {
    Persian (String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mia-w-w";
    }
    @Override
    public String purr() {
        return "puu-rrrr";
    }
}
