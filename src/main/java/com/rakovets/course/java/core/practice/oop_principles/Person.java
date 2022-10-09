package com.rakovets.course.java.core.practice.oop_principles;

public class Person {

    final int HUNDRED_PERCENTS = 100;

    private double happiness;

    Person(double happiness) {
        this.happiness = happiness;
    }

    public void changeHappiness(double changingOfHappinessInPercents) {
        happiness *= (1 + changingOfHappinessInPercents / HUNDRED_PERCENTS);
    }

    public double getHappiness() {
        return happiness;
    }
}
