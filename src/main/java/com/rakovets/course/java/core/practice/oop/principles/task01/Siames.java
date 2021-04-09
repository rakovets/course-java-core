package com.rakovets.course.java.core.practice.oop.principles.task01;

public class Siames extends Cat {
    public Siames(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "MEW-MEW_MEW";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-10.5);
    }

    @Override
    public String purr() {
        return "PRR-PRR-PRR";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(20.5);
    }
}
