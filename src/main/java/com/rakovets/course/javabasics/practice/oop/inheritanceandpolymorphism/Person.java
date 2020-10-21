package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Person {
    int happiness;

    Person(int happinessOverall) {
        this.happiness = happinessOverall;
    }

    public int changeHappiness(int happiness) {
       return this.happiness = this.happiness +(happiness);
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getHappiness() {
        return this.happiness;
    }
}
