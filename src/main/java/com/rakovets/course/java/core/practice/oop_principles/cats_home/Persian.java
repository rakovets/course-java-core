package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Persian mews";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-10.0);
        return "Persian mews";
    }

    @Override
    public String purr() {
        return "Persian purrs";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(20.0);
        return "Persian purrs";
    }
}
