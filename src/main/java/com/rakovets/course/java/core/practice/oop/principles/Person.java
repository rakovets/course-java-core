package com.rakovets.course.java.core.practice.oop.principles;

public class Person {
    private double happiness;

    public Person(double happiness) {
        this.happiness = happiness;
    }

    public double changeHappiness(double percentHappiness) {
        return happiness += percentHappiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    public double getHappiness() {
        return happiness;
    }
}
