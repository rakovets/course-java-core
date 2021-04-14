package com.rakovets.course.java.core.practice.oop.principles;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    public Persian() {}

    @Override
    public String mew() {
        return "maaw-maaw";
    }

    @Override
    public String purr() {
        return "murr-murr-murr";
    }

    @Override
    public double mew(Person person) {
        return person.changeHappiness() - 0.1 * Math.abs(person.getPercentHappiness());
    }

    @Override
    public double purr(Person person) {
        return person.changeHappiness() + 0.5 * Math.abs(person.getPercentHappiness());
    }
}
