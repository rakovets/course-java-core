package com.rakovets.course.java.core.practice.oop.principles.project_cat;

public class Person {
    private double happines;

    public Person(double happines) {
        this.happines = happines;
    }

    public void changeHappiness(double percentHapiness) {
        this.happines += this.happines * percentHapiness / 100;
    }

    public double getHappiness() {
        return this.happines;
    }

    public void setHappiness(double happines) {
        this.happines = happines;
    }
}
