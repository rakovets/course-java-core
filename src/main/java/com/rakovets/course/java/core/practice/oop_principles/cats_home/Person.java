package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Person {
    double happiness;

    Person(double happiness) {
        this.happiness = happiness;
    }

    public double changeHappiness(double percentHappiness) {
        return percentHappiness += happiness;
    }

    public double getHappiness() {
        return happiness;
    }
    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }
}
