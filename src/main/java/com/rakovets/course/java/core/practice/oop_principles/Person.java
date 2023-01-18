package com.rakovets.course.java.core.practice.oop_principles;

public class Person {
    private int happiness;

    public Person(int happiness) {
        checkRangeOfHappiness(happiness);
    }

    public int changeHappiness(int percentHappiness) {
        return this.happiness += percentHappiness;
    }

    public int getHappiness() {
        return this.checkRangeOfHappiness(happiness);
    }

    public int setHappiness(int happiness) {
        return checkRangeOfHappiness(happiness);
    }

    private int checkRangeOfHappiness(int happiness) {
        if (happiness >= 100) {
            this.happiness = 100;
        } else {
            this.happiness = Math.max(happiness, 0);
        }
        return happiness;
    }
}
