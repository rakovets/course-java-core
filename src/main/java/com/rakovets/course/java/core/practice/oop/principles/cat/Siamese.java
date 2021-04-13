package com.rakovets.course.java.core.practice.oop.principles.cat;

public class Siamese extends Cat {
    public Siamese(String nameCate) {
        super(nameCate);
    }

    public void mew() {
        System.out.println("Miiiiy miyyy");
    }

    public void purr() {
        System.out.println("Mrrr Mrrr");
    }
    public void mew(Person person) {
        person.changeHappiness(-10);
    }
    public void purr(Person person) {
        person.changeHappiness(30);
    }
}
