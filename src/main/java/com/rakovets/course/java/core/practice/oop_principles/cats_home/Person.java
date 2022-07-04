package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Person {
    final int MAX_PERCENTAGE = 100;
    int happiness;

    Person(int happiness) {
        this.happiness = happiness;
    }

    public int changeHappiness(int percentHappiness) {
        return this.happiness += percentHappiness;
    }

    public double getHappiness() {
        return happiness;
    }
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
