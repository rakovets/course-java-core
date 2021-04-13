package com.rakovets.course.java.core.practice.oop.principles.cat;

public class Person {
    private int happiness;

    public Person (int happiness) {
        this.happiness=happiness;
    }

    public void changeHappiness(int percentHappiness) {
        happiness += happiness * percentHappiness * 0.01f;
    }
    public int getHappiness() {
        return happiness;
    }
    public  void setHappiness( int happiness) {
        this.happiness = happiness;
    }


}
