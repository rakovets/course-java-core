package com.rakovets.course.challenge.oopInheritanceAndPolymorphism;

public class Persian extends Cat {
    Persian(String name) {
        super(name);
    }

    @Override
    void mew() {
        System.out.println("meow3");
    }

    @Override
    void mew(Persona persona) {
        System.out.println("meow");
        persona.takeHappiness(-10);
    }

    @Override
    void purr() {
        System.out.println("purr3");
    }

    @Override
    void purr(Persona persona) {
        System.out.println("purr");
        persona.takeHappiness(30);
    }
}