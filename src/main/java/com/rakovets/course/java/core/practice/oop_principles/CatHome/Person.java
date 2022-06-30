package com.rakovets.course.java.core.practice.oop_principles.CatHome;

public class Person {
    private int happiness;

    public Person(int happiness) {
        setHappiness(happiness);
    }

    public void changeHappiness(int percentHappiness) {
        setHappiness(happiness + percentHappiness);
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        if (happiness < 0) {
            this.happiness = 0;
        } else if (happiness > 100) {
            this.happiness = 100;
        } else {
            this.happiness = happiness;
        }
    }

}
