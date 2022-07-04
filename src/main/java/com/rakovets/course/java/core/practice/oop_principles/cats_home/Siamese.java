package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat {
    Siamese(String name) {
        super(name);
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-50);
        return "miw-miw";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(+50);
        return "pr-pr";
    }
}
