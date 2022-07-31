package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat {
    Siamese (String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mewww";
    }

    @Override
    public String purr() {
        return "pur-r-r";
    }

    @Override
    public String mew (Person user) {
        user.changeHappiness(-8);
        return "mewww. Master, Siamese wants to eat!";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(+8);
        return "pur-r-r. Siamese is happy!";
    }
}
