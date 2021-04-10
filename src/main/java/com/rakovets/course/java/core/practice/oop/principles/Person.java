package com.rakovets.course.java.core.practice.oop.principles;

public class Person {
    private int happiness;

    public Person(int happiness) {
        this.happiness = happiness;
    }

    public void changeHappiness(int percentHappiness) {
        setHappiness(this.happiness + percentHappiness);
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getHappiness() {
        return happiness;
    }
}
