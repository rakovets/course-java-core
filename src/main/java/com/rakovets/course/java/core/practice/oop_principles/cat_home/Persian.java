package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Persian extends Cat {
    private static final int MEW_PERCENT_HAPPINESS = -40;
    private static final int PURR_PERCENT_HAPPINESS = 40;

    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meeeeeeeeeew";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(MEW_PERCENT_HAPPINESS);
        return mew();
    }

    @Override
    public String purr() {
        return "Puuuuuuuuuurr";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(PURR_PERCENT_HAPPINESS);
        return purr();
    }
}
