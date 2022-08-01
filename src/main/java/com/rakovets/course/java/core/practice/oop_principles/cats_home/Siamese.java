package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat {
    private static final int MEW_PERCENT_HAPPINESS = -15;
    private static final int PURR_PERCENT_HAPPINESS = 15;
    Siamese (String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mewww";
    }

    @Override
    public String purr() {
        return "pur-r-r";
    }

    @Override
    public String mew (Person user) {
        user.changeHappiness(MEW_PERCENT_HAPPINESS);
        return "mewww. Master, Siamese wants to eat!";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(PURR_PERCENT_HAPPINESS);
        return "pur-r-r. Siamese is happy!";
    }
}
