package com.rakovets.course.java.core.practice.oop.principles.cat_home;

public class Person {
    private double happiness;

    public Person(double happiness) {
        if (happiness >= 0 && happiness <= 100) {
            this.happiness = happiness;
        }
    }

    public void changeHappiness(double percentHappiness) {
        if (percentHappiness >= -100 && percentHappiness <= 100) {
            return;
        }
        if (happiness + percentHappiness >= 100) {
            happiness = 100;
        } else if (happiness + percentHappiness <= 0) {
            happiness = 0;
        } else {
            happiness -= percentHappiness;
        }
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        if (happiness < 0 || happiness > 100) {
            return;
        }
        this.happiness = happiness;
    }
}
