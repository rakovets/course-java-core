package com.rakovets.course.java.core.practice.oop.principles.сats_home;

public class Person {
    private double happiness;

    public Person (double happiness) {
        this.happiness = happiness;
    }

    public void changeHappiness(double percentHappiness) {
        this.happiness += percentHappiness;
    }

    public double getHappiness () {
        return this.happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }
}
