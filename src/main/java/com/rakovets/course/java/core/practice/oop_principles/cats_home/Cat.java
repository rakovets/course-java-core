package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private String name;
    private final double NEGATIVE_PERCENT_HAPPINESS = -10.0;
    private final double POSITIVE_PERCENT_HAPPINESS = 20.0;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "Mew";
    }

    public String mew(Person user) {
        user.changeHappiness(NEGATIVE_PERCENT_HAPPINESS);
        return "Mew";
    }

    public String purr() {
        return "Purr";
    }

    public String purr(Person user) {
        user.changeHappiness(POSITIVE_PERCENT_HAPPINESS);
        return "Purr";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
