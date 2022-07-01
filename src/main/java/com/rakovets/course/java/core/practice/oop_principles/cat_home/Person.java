package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Person {
    private double happiness;

    public Person(double happiness) {
        this.happiness = happiness;
    }

    public void changeHappiness(double happiness) {
        this.happiness = happiness;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }
}
