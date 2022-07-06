package com.rakovets.course.java.core.practice.oop_principles.cats;

public class Person {
    private double happiness;

    public Person(double happiness) {
        checkDiapason(happiness);
    }

    public double changeHappiness(double percentHappiness) {
            return happiness += percentHappiness;
    }

    public double getHappiness() {
       return this.checkDiapason(happiness);
    }

    public double setHappiness(double happiness) {
        return checkDiapason(happiness);
    }

    private double checkDiapason(double happiness) {
        if (happiness >= 100.0) {
            this.happiness = 100.0;
        } else {
            this.happiness = Math.max(happiness, 0.0);
        }
        return happiness;
    }
}
