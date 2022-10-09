package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Siamese mews";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-5.0);
        return "Siamese mews";
    }

    @Override
    public String purr() {
        return "Siamese purr";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(10.0);
        return "Siamese purr";
    }
}
