package com.rakovets.course.java.core.practice.oop_principles.cats_home;

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

    @Override
    public String mew (Person user) {
        user.changeHappiness(-10);
        return "mia-w-w. Master, Persian wants to eat!";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(+10);
        return "puu-rrrr. Persian is happy!";
    }
}
