package com.rakovets.course.challenge.solution;

public class Sphynx extends Cat {
    Sphynx(String name) {
        super(name);
    }
    void mew() {
        System.out.println("Sphynxmew--Sphynxmew");
    }

    void poor() {
        System.out.println("Sphynxpoor--Sphynxpoor");
    }
    void mew(Person person) {
        person.takeHappiness(-3);
    }
    void poor(Person person) {
        person.takeHappiness(3);
    }
}
