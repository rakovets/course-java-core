package com.rakovets.course.java.core.practice.oop.principles;

public class Sphynx extends Cat {
    public Sphynx(String name) {
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
    public String mew(Person person) {
        person.changeHappiness(-10);
        return mew();
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(+1);
        return purr();
    }
}
