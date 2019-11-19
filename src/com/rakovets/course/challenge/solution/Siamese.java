package com.rakovets.course.challenge.solution;

public class Siamese extends Cat {
    Siamese(String name) {
        super(name);
    }
    void mew() {
        System.out.println("Siamesemew--Siamesemew");
    }

    void poor() {
        System.out.println("Siamesepoor--Siamesepoor");
    }
    void mew(Person person) {
        person.takeHappiness(-2);
    }
    void poor(Person person) {
        person.takeHappiness(2);
    }
}
