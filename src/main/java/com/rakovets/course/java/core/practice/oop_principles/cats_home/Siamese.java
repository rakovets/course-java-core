package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meow, meow, meow!";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-7);

        return "Meow, meow, meow!";
    }

    @Override
    public String purr() {
        return "Murrr...";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(8);

        return "Murrr...";
    }
}
