package com.rakovets.course.java.core.practice.oop.principles;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "maaw-maaw";
    }

    @Override
    public String purr() {
        return "murr-murr-murr";
    }
}
