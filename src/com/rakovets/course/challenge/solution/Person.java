package com.rakovets.course.challenge.solution;

public class Person {
    private int happiness;
    Person(int happiness) {
        this.happiness = happiness;
    }
    void takeHappiness(int happiness) {
        this.happiness += happiness;
    }
    int getHappiness() {
        return happiness;
    }
    void setHappiness(int happiness){
        this.happiness = happiness;
    }

}
