package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Siamese extends Cat {
    private static final int MEW_PERCENT_HAPPINESS = -50;
    private static final int PURR_PERCENT_HAPPINESS = 50;

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mew-shhh-Mew";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(MEW_PERCENT_HAPPINESS);
        return mew();
    }

    @Override
    public String purr() {
        return "Purr-Purrrrrrr";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(PURR_PERCENT_HAPPINESS);
        return purr();
    }
}
