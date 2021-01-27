package com.rakovets.course.java.core.practice.oop.principles;

public class Person {
    private static double happiness;

    public Person(double happiness) {
        Person.happiness = happiness;
    }

    public double changeHappiness(double percentHappines) {
       return happiness += percentHappines;
    }

    public static double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        Person.happiness = happiness;
    }
}
