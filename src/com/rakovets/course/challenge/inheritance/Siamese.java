package com.rakovets.course.challenge.inheritance;

public class Siamese extends Cat {

    Siamese(String name) {
        super(name);
    }

    @Override
    public void mew(Person person) {
        System.out.println("siamese mew");
        person.takeHappiness(-30);
    }

    @Override
    public void purr(Person person) {
        System.out.println("siamese purr");
        person.takeHappiness(30);
    }
}
