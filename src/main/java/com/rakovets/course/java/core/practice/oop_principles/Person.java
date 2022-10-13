package com.rakovets.course.java.core.practice.oop_principles;

public class Person {
    final int HUNDRED_PERCENTS = 100;
    final int CHANGE_OF_HAPPINESS = 1;

    private double happiness;

    public Person(double happiness) {
        this.happiness = happiness;
    }

    public void changeHappiness(double changingOfHappinessInPercents) {
        happiness *= (CHANGE_OF_HAPPINESS + changingOfHappinessInPercents / HUNDRED_PERCENTS);
    }

    public double getHappiness() {
        return happiness;
    }
}
