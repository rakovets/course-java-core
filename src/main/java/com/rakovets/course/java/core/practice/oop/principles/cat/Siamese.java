package com.rakovets.course.java.core.practice.oop.principles.cat;

public class Siamese extends Cat {
    final String PUR_PERSIAN = "Purr-purr";
    final String MEW_PERSIAN = "Mew-mew";
    final int PERCENT_HAPPINESS = 20;
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return MEW_PERSIAN;
    }

    @Override
    public String purr() {
        return PUR_PERSIAN;
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-PERCENT_HAPPINESS);
        return MEW_PERSIAN;
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(PERCENT_HAPPINESS);
        return PUR_PERSIAN;
    }
}
