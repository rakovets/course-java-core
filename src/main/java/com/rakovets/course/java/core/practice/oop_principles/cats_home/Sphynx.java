package com.rakovets.course.java.core.practice.oop_principles.cats_home;

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

        return "Mau, mau, mau!";
    }

    @Override
    public String purr() {
        return "Purrr...purrr...";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(9);

        return "Purrr...purrr...";
    }
}
