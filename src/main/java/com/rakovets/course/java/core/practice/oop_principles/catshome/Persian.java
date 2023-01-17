package com.rakovets.course.java.core.practice.oop_principles.catshome;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meoooow, meoooow!";
    }

    @Override
    public String purr() {
        return "Murrr...murrr...";
    }
}
