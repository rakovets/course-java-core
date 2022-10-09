package com.rakovets.course.java.core.practice.oop_principles.cats_home.cats_and_person;

public class Person {
    private double happiness;

    public Person(double happiness) {
        this.happiness = happiness;
    }

    public double changeHappiness(double percentHappiness) {
        return happiness += percentHappiness;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness() {
        this.happiness = happiness;
    }
}
