package com.rakovets.course.challenge.CatsHome;

public class Person {

    int happiness;

    Person(int happiness) {
        this.happiness = happiness;
    }

    Person(){
    }

    public void takeHappiness(int happiness) {
        this.happiness += happiness;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
