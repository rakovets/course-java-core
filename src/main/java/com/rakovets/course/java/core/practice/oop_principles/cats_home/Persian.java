package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat {
    private static final int MEW_PERCENT_HAPPINESS = -10;
    private static final int PURR_PERCENT_HAPPINESS = 10;
    Persian (String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mia-w-w";
    }
    @Override
    public String purr() {
        return "puu-rrrr";
    }

    @Override
    public String mew (Person user) {
        user.changeHappiness(MEW_PERCENT_HAPPINESS);
        return "mia-w-w. Master, Persian wants to eat!";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(PURR_PERCENT_HAPPINESS);
        return "puu-rrrr. Persian is happy!";
    }
}
