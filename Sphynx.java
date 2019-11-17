package com.rakovets.course.challenge.oopInheritanceAndPolymorphism;

public class Sphynx extends Cat {
    Sphynx(String name) {
        super(name);
    }

    @Override
    void mew() {
        System.out.println("meow4");
    }

    @Override
    void mew(Persona persona) {
        System.out.println("meow");
        persona.takeHappiness(-5);
    }

    @Override
    void purr() {
        System.out.println("purr4");
    }

    @Override
    void purr(Persona persona) {
        System.out.println("purr");
        persona.takeHappiness(10);
    }
}