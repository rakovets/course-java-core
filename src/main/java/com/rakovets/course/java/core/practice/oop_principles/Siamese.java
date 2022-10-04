package com.rakovets.course.java.core.practice.oop_principles;

public class Siamese extends Cat {

    public String mew() {
        return "Mewmew - Mewmew!";
    }

    public String mew(Person person) {
        person.changeHappiness(-5);
        return "Mew - Mew!";
    }

    public String purr() {
        return "MrrMrrMmrrrmmrrrr!";
    }

    public String purr(Person person){
        person.changeHappiness(+5);
        return "MrrMrrM!";
    }
}
