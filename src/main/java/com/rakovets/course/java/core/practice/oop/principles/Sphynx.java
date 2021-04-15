package com.rakovets.course.java.core.practice.oop.principles;

public class Sphynx extends Cat{
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String catSayMew() {
        return "me me me";
    }

    @Override
    public String catPurr() {
        return "mur-mur";
    }

    @Override
    public void catSayMew(Person person) {
        person.changeHappiness(-30);
    }

    @Override
    public void catPurr(Person person) {
        person.changeHappiness(25);
    }
}
