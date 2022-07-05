package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Sphynx extends Cat {
    private final int MEW_PERCENT_HAPPINESS = -30;
    private final int PURR_PERCENT_HAPPINESS = 30;

    public Sphynx(String name) {
        super(name);
    }

    public String mew() {
        return "Mew-Mew-Mew";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(MEW_PERCENT_HAPPINESS);
        return mew();
    }

    @Override
    public String purr() {
        return "Purr-Purr-Purr";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(PURR_PERCENT_HAPPINESS);
        return purr();
    }
}
