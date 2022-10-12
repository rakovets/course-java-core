package com.rakovets.course.java.core.practice.oop_principles.cat.cats;

import com.rakovets.course.java.core.practice.oop_principles.cat.Person;

public class Cat {
    private final double PERCENT_SADNESS = -4;
    private final double PERCENT_HAPPINESS = 5;
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "mew-mew";
    }

    public void mew(Person man) {
        man.changeHappiness(PERCENT_SADNESS);
    }

    public String purr() {
        return "purrr-purrr-purrr";
    }

    public void purr(Person man) {
        man.changeHappiness(PERCENT_HAPPINESS);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentHappiness() {
        return PERCENT_HAPPINESS;
    }

    public double getPercentSadness() {
        return PERCENT_SADNESS;
    }
}
