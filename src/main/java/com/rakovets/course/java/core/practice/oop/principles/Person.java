package com.rakovets.course.java.core.practice.oop.principles;

public class Person {
    private String namePerson;
    private double happiness;

    public Person(String namePerson, double happiness) {
        this.namePerson = namePerson;
        this.happiness = happiness;
    }

    public double changeHappiness(double percentHappiness) {
       return happiness += percentHappiness;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }
}
