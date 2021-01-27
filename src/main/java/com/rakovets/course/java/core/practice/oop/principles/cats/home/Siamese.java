package com.rakovets.course.java.core.practice.oop.principles.cats.home;

public class Siamese extends Cat {

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mewooo";
    }

    @Override
    public String mew(Person value) {
        value.changeHappiness(-26.0);
        return "Mewooo";
    }

    @Override
    public String purr() {
        return "Purrhrhrhr";
    }

    @Override
    public String purr(Person value) {
        value.changeHappiness(32.0);
        return "Purrhrhrhr";
    }
}

