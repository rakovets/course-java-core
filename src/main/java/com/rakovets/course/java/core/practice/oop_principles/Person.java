package com.rakovets.course.java.core.practice.oop_principles;

public class Person {
    private double happiness;

    Person(double happiness) {
        this.happiness = happiness;
        checkMinMaxHappiness();
    }

    public void changeHappiness(double percentHappiness) {
        this.happiness +=percentHappiness;
        checkMinMaxHappiness();
    }

    private void checkMinMaxHappiness() {
        if (this.happiness > 100) {
            this.happiness = 100;
        }
        else if (this.happiness < 0) {
            this.happiness = 0;}
    }

    public double getHappiness() {
        return this.happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
        checkMinMaxHappiness();
    }
}
