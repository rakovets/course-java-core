package com.rakovets.course.java.core.practice.oop_principles;

public class Sphynx extends Cat {
    Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Sphynx: meow-meow-meow";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-10);
    }

    @Override
    public String purr() {
        return "Sphynx: purr-purr-purr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(15);
    }
}
