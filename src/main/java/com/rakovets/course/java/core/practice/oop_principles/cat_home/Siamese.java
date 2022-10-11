package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Siamese extends Cat {
    @Override
    public String mew() {
        return "Mewmew - Mewmew!";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-5);
        return "Mew - Mew!";
    }

    @Override
    public String purr() {
        return "MrrMrrMmrrrmmrrrr!";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(+5);
        return "MrrMrrM!";
    }
}
