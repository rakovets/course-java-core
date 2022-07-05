package com.rakovets.course.java.core.practice.oop_principles.catshome;

public class Person {
    private int happiness;

    public Person (int happiness) {
        this.happiness = happiness;
    }

    public void changeHappiness(int percentHappiness) {
        this.happiness += percentHappiness;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
