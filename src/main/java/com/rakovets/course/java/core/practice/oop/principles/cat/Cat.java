package com.rakovets.course.java.core.practice.oop.principles.cat;

public class Cat {
    private String name;
    final String PUR_PERSIAN = "Purr";
    final String MEW_PERSIAN = "Mew";
    final int PERCENT_HAPPINESS = 10;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return MEW_PERSIAN;
    }

    public String purr() {
        return PUR_PERSIAN;
    }

    public String mew(Person user) {
        user.changeHappiness(-PERCENT_HAPPINESS);
        return MEW_PERSIAN;
    }

    public String purr(Person user) {
        user.changeHappiness(PERCENT_HAPPINESS);
        return PUR_PERSIAN;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
