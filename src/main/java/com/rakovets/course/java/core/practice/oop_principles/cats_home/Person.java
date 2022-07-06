package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Person {
    final double MINIMUM_HAPPINESS = 0;
    final double MAXIMUM_HAPPINESS = 100;

    private double happiness;

    public Person(double happiness) {
        this.happiness = happiness;
        checkMinMaxHappiness();
    }

    public void changeHappiness(double percentHappiness) {
        this.happiness +=percentHappiness;
        checkMinMaxHappiness();
    }

    protected void checkMinMaxHappiness() {
        if (this.happiness > MAXIMUM_HAPPINESS) {
            this.happiness = MAXIMUM_HAPPINESS;
        }
        else if (this.happiness < MINIMUM_HAPPINESS) {
            this.happiness = MINIMUM_HAPPINESS;
        }
    }

    public double getHappiness() {
        return this.happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
        checkMinMaxHappiness();
    }
}
