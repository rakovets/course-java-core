package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {
    private static final int MEW_PERCENT_HAPPINESS = -20;
    private static final int PURR_PERCENT_HAPPINESS = 20;
    Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "meeaaw";
    }

    @Override
    public String purr() {
        return "pppuurr";
    }

    @Override
    public String mew (Person user) {
        user.changeHappiness(MEW_PERCENT_HAPPINESS);
        return "meeaaw. Master, Sphynx wants to eat!";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(PURR_PERCENT_HAPPINESS);
        return "pppuurr. Sphynx is happy!";
    }
}
