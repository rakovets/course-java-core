package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Persian extends Cat {
    @Override
    public String mew() {
        return "I want eat!";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-15);
        return "Mew - Mew!";
    }

    @Override
    public String purr() {
        return "GavGav!";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(+10);
        return "MrrMrrM!";
    }
}
