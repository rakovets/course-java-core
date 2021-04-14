package com.rakovets.course.java.core.practice.oop.principles.project.cats.home;

public class Person {
    private int happiness;



    public Person(int happiness) {
        this.happiness = happiness;
    }


    public int changeHappiness(int percentHappiness) {
        return happiness += percentHappiness;
    }


    public int getHappiness() {
        return happiness;
    }


    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }



}
