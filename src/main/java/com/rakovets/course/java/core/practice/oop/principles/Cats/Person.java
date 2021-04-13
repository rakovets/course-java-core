package com.rakovets.course.java.core.practice.oop.principles.Cats;

public class Person {
    int happiness = 100;

    public Person(int happiness){
        this.happiness = happiness;
    }

    public void changeHappiness(int percentHappiness){
        if(percentHappiness < 0){
            happiness -= - percentHappiness;
        }
        else if (percentHappiness >= 0){
            happiness += percentHappiness;
        }

    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
