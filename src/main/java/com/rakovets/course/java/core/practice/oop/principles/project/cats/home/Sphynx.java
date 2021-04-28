package com.rakovets.course.java.core.practice.oop.principles.project.cats.home;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }
    private final static int DECREASED_LEVEL_HAPPINESS = -50;
    private final static int INCREASED_LEVEL_HAPPINESS = 50;

    @Override
    public String mew() {
        return "MEEEEEEEEEEEW";
    }

    @Override
    public String purr() {
        return "pr";
    }

    @Override
    public int mew(Person person) {
        return person.changeHappiness(DECREASED_LEVEL_HAPPINESS);
    }

    @Override
    public int purr(Person person) {
        return person.changeHappiness(INCREASED_LEVEL_HAPPINESS);
    }
}
