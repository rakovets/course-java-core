package com.rakovets.course.challenge.inheritance;

public class Sphynx extends Cat {
    Sphynx(String name) {
        super(name);
    }

    @Override
    public void mew(Person person) {
        System.out.println("sphynx mew");
        person.takeHappiness(-15);
    }

    @Override
    public void purr(Person person) {
        System.out.println("sphynx purr");
        person.takeHappiness(15);
    }
}
