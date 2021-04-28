package com.rakovets.course.java.core.practice.oop.principles.project.cats.home;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }
    private final static int DECREASED_LEVEL_HAPPINESS = -10;
    private final static int INCREASED_LEVEL_HAPPINESS = 10;

    @Override
    public String mew() {
        return "meeeeew";
    }

    @Override
    public String purr() {
        return "prrrr";
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
