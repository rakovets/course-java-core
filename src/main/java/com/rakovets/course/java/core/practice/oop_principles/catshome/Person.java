package com.rakovets.course.java.core.practice.oop_principles.catshome;

public class Person {
    private int happiness;

    public Person(int hapiness) {
        this.happiness = hapiness;
    }

    public int changeHappiness(int percentHappiness) {
      return happiness += (happiness * percentHappiness) / 100;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
