package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Person {
    private int happiness;

    public Person(int happiness) {
        this.happiness = happiness;
    }

    public int changeHappiness(int percentHappiness) {
        return happiness = happiness + happiness * percentHappiness / 100;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
