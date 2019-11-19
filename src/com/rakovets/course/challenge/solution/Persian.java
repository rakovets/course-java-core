package com.rakovets.course.challenge.solution;

public class Persian extends Cat {
    Persian(String name) {
        super(name);
    }
    void mew() {
        System.out.println("Persianmew--Persianmew");
    }

    void poor() {
        System.out.println("Persianpoor--Persianpoor");
    }
    void mew(Person person) {
        person.takeHappiness(-1);
    }
    void poor(Person person) {
        person.takeHappiness(1);
    }
}
