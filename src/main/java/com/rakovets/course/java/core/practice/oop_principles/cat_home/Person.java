package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Person {
    private int happiness;

    public Person(int happiness) {
        this.happiness = happiness;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void changeHappiness(int percentHappiness) {
        setHappiness(happiness + percentHappiness);
    }
}
