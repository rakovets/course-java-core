package com.rakovets.course.java.core.practice.oop.principles.cats.home;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "meeew";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-8);
    }

    @Override
    public String purr() {
        return "phh";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(8);
    }
}
