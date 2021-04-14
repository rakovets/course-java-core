package com.rakovets.course.java.core.practice.oop.principles;

public class Person {
    private String namePerson;
    private double happiness;
    private double percentHappiness;

    public Person(String namePepson, double happiness) {
        this.namePerson = namePepson;
        this.happiness = happiness;
    }

    public double changeHappiness() {
       return happiness += percentHappiness;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public double getPercentHappiness() {
        return percentHappiness;
    }

    public void setPercentHappiness(double percentHappiness) {
        this.percentHappiness = percentHappiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }
}
