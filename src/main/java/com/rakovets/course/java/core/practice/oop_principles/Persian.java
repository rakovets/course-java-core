package com.rakovets.course.java.core.practice.oop_principles;

public class Persian extends Cat {

    public String mew() {
        return "I want eat!";
    }

    public String mew(Person person) {
        person.changeHappiness(-15);
        return "Mew - Mew!";
    }

    public String purr() {
        return "GavGav!";
    }

    public String purr(Person person){
        person.changeHappiness(+10);
        return "MrrMrrM!";
    }
}
