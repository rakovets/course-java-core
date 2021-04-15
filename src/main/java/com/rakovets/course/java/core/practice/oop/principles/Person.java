package com.rakovets.course.java.core.practice.oop.principles;

public class Person {
    public int happiness;

    public Person(int happiness) {
        this.happiness = happiness;
    }

    public void changeHappiness(int percentHappiness) {

        happiness += percentHappiness;
    }

    public int getHappiness() {

        return happiness;
    }

    public void setHappiness(int happiness) {

        this.happiness = happiness;
    }
}
