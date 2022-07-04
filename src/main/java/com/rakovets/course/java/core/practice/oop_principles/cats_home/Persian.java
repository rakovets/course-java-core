package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat {
    Persian(String name) {
        super(name);
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-15);
        return "miaow-miaow";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(+15);
        return "mr-mr";
    }
}
