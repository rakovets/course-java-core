package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Sphynx extends Cat {
    public String mew() {
        return "My name Sphynx!";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-20);
        return "Mew - Mew!";
    }

    public String purr() {
        return "RRRRRRRRR!";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(+20);
        return "MrrMrrM!";
    }
}
