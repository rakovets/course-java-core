package com.rakovets.course.challenge.oopInheritanceAndPolymorphism;

public class Siamese extends Cat {
    Siamese(String name) {
        super(name);
    }

    @Override
    void mew() {
        System.out.println("meow2");
    }

    @Override
    void mew(Persona persona) {
        System.out.println("meow");
        persona.takeHappiness(-10);
    }

    @Override
    void purr() {
        System.out.println("purr");
    }

    @Override
    void purr(Persona persona) {
        System.out.println("purr");
        persona.takeHappiness(20);
    }
}
