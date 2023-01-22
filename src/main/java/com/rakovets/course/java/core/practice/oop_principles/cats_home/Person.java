package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Person {
    private int happiness;

    public Person() {
    }

    public Person(int happiness) {
        this.happiness = happiness;
        checkValidHappiness();
    }

    public void changeHappiness(int percentHappiness) {
        happiness += percentHappiness;
        checkValidHappiness();
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
        checkValidHappiness();
    }

    private void checkValidHappiness() {
        if (happiness < 0) {
            happiness = 0;
        } else if (happiness > 100) {
            happiness = 100;
        }
    }
}
