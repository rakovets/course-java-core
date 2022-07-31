package com.rakovets.course.java.core.practice.oop_principles;

public class Person {
    private int happiness;

    public Person (int happiness) {
        this.happiness = happiness;
    }

    public int changeHappiness(int persentHappiness) {
        return this.happiness += persentHappiness;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness (int happiness) {
        this.happiness = happiness;
    }
}
