package com.rakovets.course.java.core.practice.oop.principles.project.cats.home;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }
    private final static int DECREASED_LEVEL_HAPPINESS = -30;
    private final static int INCREASED_LEVEL_HAPPINESS = 30;

    @Override
    public String mew() {
        return "MEW";
    }

    @Override
    public String purr() {
        return "PURR";
    }

    @Override
    public int mew(Person person) {
        return person.changeHappiness(DECREASED_LEVEL_HAPPINESS);
    }

    public int purr(Person person) {
        return person.changeHappiness(INCREASED_LEVEL_HAPPINESS);
    }
}
