package com.rakovets.course.java.core.practice.oop.principles;

public class Siamese extends Cat{
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String catSayMew() {
        return "meow-meow";
    }

    @Override
    public String catPurr() {
        return "murr-murr-murr";
    }

    @Override
    public void catSayMew(Person person) {
        person.changeHappiness(-5);
    }

    @Override
    public void catPurr(Person person) {
        person.changeHappiness(90);
    }
}
