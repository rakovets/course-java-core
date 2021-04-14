package com.rakovets.course.java.core.practice.oop.principles;

public class Sphynx extends Cat {
    private final int HAPPINESS_MEW = 25;

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mew! Kill me!";
    }

    @Override
    public String purr() {
        return "Purr! Make me die!";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-HAPPINESS_MEW);
        return mew();
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(HAPPINESS_MEW);
        return purr();
    }
}
