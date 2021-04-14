package com.rakovets.course.java.core.practice.oop.principles;

public class Persian extends Cat {
    private final int HAPPINESS_MEW = 25;

    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Persian May!";
    }

    @Override
    public String purr() {
        return "Persian Myp!";
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
