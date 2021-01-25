package com.rakovets.course.java.core.practice.oop.principles.cat.home;

public class Person {
    public static double happiness;

    public Person(double happiness) {
        Person.happiness = happiness;
    }

    public double changeHappiness(double percentHappiness) {
        return happiness += percentHappiness;
    }

    public static double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        Person.happiness = happiness;
    }
}
