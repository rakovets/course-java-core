package com.rakovets.course.java.core.practice.oop_principles.catshome;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meow like Sphynx";
    }

    @Override
    public String purr() {
        return "Meow like Sphynx";
    }

    @Override
    public void mew(Person p) {
        p.changeHappiness(-20);
    }

    @Override
    public void purr(Person p) {
        p.changeHappiness(5);
    }
}
