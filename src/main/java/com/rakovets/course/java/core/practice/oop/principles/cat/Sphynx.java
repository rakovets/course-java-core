package com.rakovets.course.java.core.practice.oop.principles.cat;

public class Sphynx extends Cat {
    public Sphynx(String nameCate) {
        super(nameCate);
    }

    public void mew() {
        System.out.println("Mi mi");
    }
    public void purr() {
        System.out.println("Grrr Grrr");
    }
    public void mew(Person person) {
        person.changeHappiness(-20);
    }
    public void purr(Person person) {
        person.changeHappiness(1);
    }
}
