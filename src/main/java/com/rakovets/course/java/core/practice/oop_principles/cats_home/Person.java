package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Person {
    private double happiness;

    public Person(double happiness) {
        this.happiness = happiness;
    }

    public int changeHappiness(double percentHappiness) {
        happiness += happiness + percentHappiness;
        return 0;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }
}
