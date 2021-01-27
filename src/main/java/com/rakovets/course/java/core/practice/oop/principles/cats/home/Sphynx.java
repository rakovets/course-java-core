package com.rakovets.course.java.core.practice.oop.principles.cats.home;

public class Sphynx extends Cat {

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meweeee";
    }

    @Override
    public String mew(Person value) {
        value.changeHappiness(-23.0);
        return "Meweeee";
    }

    @Override
    public String purr() {
        return "Purrsssss";
    }

    @Override
    public String purr(Person value) {
        value.changeHappiness(44.0);
        return "Purrsssss";
    }
}
