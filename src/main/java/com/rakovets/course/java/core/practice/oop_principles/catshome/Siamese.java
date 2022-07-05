package com.rakovets.course.java.core.practice.oop_principles.catshome;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meow like Siamese";
    }

    @Override
    public String purr() {
        return "Purr like Siamese";
    }

    @Override
    public void mew(Person p) {
        p.changeHappiness(-15);
    }

    @Override
    public void purr(Person p) {
        p.changeHappiness(15);
    }
}
