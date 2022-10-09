package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Person {
    private double happiness;

    public Person(double happiness) {
        this.happiness = happiness;
    }

    public void changeHappiness(double percentHappiness) {
        happiness += happiness * percentHappiness / 100;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }
}
