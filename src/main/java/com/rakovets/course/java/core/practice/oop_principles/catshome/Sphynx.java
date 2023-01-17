package com.rakovets.course.java.core.practice.oop_principles.catshome;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mau, mau, mau!";
    }

    public String mew(Person user) {
        user.changeHappiness(-12);

        return "Meow, meow, meow!";
    }

    @Override
    public String purr() {
        return "Purrr...purrr...";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(9);

        return "Murrr...";
    }
}
