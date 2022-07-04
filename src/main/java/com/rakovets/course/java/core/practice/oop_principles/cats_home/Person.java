package com.rakovets.course.java.core.practice.oop_principles.cats_home;
public class Person {
    private double happiness;

    public Person(double happiness) {
        this.happiness = happiness;
    }

    public double changeHappiness(double percentHappiness) {
        return this.happiness += percentHappiness;
    }

    public double getHappiness() {
        return this.happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }
}
