package com.rakovets.course.java.core.practice.oop.principles;

public class Sphynx extends Cat {
    Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Kill me!";
    }

    @Override
    public String purr() {
        return "Make me die!";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-10);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(+1);
    }
}
