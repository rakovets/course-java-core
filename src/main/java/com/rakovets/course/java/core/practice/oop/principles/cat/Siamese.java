package com.rakovets.course.java.core.practice.oop.principles.cat;

public class Siamese extends Cat {
    private final int HAPPINESS_MEW = 25;

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mew-Mew";
    }

    @Override
    public String purr() {
        return "Purr-Purr";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-HAPPINESS_MEW);
        return mew();
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(HAPPINESS_MEW);
        return purr();
    }
}
