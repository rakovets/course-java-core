package com.rakovets.course.java.core.practice.oop.principles;

public class Person {
    private int happiness;

    public Person(int happiness) {
        this.happiness = happiness;
    }
    public int changeHappiness (int percentHappiness) {
        return this.happiness += percentHappiness;
    }
    public int getHappiness() {
        return this.happiness;
    }
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
