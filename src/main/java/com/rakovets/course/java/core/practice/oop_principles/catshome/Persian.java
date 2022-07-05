package com.rakovets.course.java.core.practice.oop_principles.catshome;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meow like Persian";
    }

    @Override
    public String purr() {
        return "Purr like Persian";
    }

    @Override
    public void mew(Person p) {
        p.changeHappiness(-5);
    }

    @Override
    public void purr(Person p) {
        p.changeHappiness(25);
    }
}
