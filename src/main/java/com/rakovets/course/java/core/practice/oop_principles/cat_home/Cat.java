package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Cat {
    private static final int MEW_PERCENT_HAPPINESS = -10;
    private static final int PURR_PERCENT_HAPPINESS = 10;
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "Mew";
    }

    public String mew(Person user) {
        user.changeHappiness(MEW_PERCENT_HAPPINESS);
        return mew();
    }

    public String purr() {
        return "Purr";
    }

    public String purr(Person user) {
        user.changeHappiness(PURR_PERCENT_HAPPINESS);
        return purr();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
