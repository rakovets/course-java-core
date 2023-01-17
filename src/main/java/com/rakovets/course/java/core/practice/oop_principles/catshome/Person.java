package com.rakovets.course.java.core.practice.oop_principles.catshome;

public class Person {
    protected int happiness;

    public Person (int happiness) {
        if (happiness >= 0 && happiness <= 100) {
            this.happiness = happiness;
        } else {
            throw new ArithmeticException("Happiness could be from 0% to 100% only!");
        }
    }

    public void changeHappiness(int percentHappiness) {
        if (percentHappiness >= 0 && this.happiness + percentHappiness <= 100
            || percentHappiness < 0 && (this.happiness + percentHappiness) >= 0) {
            this.happiness += percentHappiness;
        } else if (percentHappiness >= 0 && (this.happiness + percentHappiness) > 100) {
            this.happiness = 100;
        } else if (percentHappiness < 0 && (this.happiness + percentHappiness) < 0) {
            this.happiness = 0;
        }
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        if (happiness >= 0 && happiness <= 100) {
            this.happiness = happiness;
        } else {
            throw new ArithmeticException("Happiness could be from 0% to 100% only!");
        }
    }
}
