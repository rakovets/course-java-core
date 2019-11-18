package com.rakovets.course.challenge.inheritance;

public class Persian extends Cat {
    Persian(String name) {
        super(name);
    }

    @Override
    public void mew(Person person) {
        System.out.println("persian mew");
        person.takeHappiness(-20);
    }

    @Override
    public void purr(Person person) {
        System.out.println("persian purr");
        person.takeHappiness(20);
    }
}
