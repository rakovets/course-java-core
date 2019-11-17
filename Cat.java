package com.rakovets.course.challenge.oopInheritanceAndPolymorphism;

public class Cat {
    String name;

    Cat(String name){
        this.name = name;
    }

    void mew() {
        System.out.println("meow");
    }

    void mew(Persona persona) {
        System.out.println("meow");
        persona.takeHappiness(-10);
    }

    void purr() {
        System.out.println("purr");
    }

    void purr(Persona persona) {
        System.out.println("purr");
        persona.takeHappiness(-20);
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.printf("Cat's name: %s\n", this.name);
    }
}
