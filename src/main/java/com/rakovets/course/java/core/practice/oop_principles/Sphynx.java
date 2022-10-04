package com.rakovets.course.java.core.practice.oop_principles;

public class Sphynx extends Cat {

    public String mew() {
        return "My name Sphynx!";
    }

    public String mew(Person person) {
        person.changeHappiness(-20);
        return "Mew - Mew!";
    }

    public String purr() {
        return "RRRRRRRRR!";
    }

    public String purr(Person person){
        person.changeHappiness(+20);
        return "MrrMrrM!";
    }
}
