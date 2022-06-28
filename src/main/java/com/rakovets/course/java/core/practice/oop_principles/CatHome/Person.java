package com.rakovets.course.java.core.practice.oop_principles.CatHome;

public class Person {
    private float happiness;

    public Person(float happiness) {
        this.happiness = happiness;
    }

    public float changeHappiness(float percentHappiness) {
        return happiness + happiness * percentHappiness / 100;
    }

    public float getHappiness() {
        return happiness;
    }

    public void setHappiness(float happiness) {
        this.happiness = happiness;
    }
}
