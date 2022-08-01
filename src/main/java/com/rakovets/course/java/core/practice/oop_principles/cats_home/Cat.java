package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private static final int MEW_PERCENT_HAPPINESS = -5;
    private static final int PURR_PERCENT_HAPPINESS = 5;
    private String name;

    public Cat (String name) {
        this.name = name;
    }

    public String mew() {
        return "mew";
    }

    public String purr() {
        return "purr";
    }

    public String mew(Person user) {
        user.changeHappiness(MEW_PERCENT_HAPPINESS);
        return mew();
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
