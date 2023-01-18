package com.rakovets.course.java.core.practice.oop_principles;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Miaw";
    }

    @Override
    public int mew(Person person) {
        return person.changeHappiness(-4);
    }

    @Override
    public String purr() {
        return "Purr";
    }

    public int purr(Person person) {
        return person.changeHappiness(4);
    }
}
