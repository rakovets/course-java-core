package com.rakovets.course.java.core.practice.oop_principles;

public class Siamese extends Cat {
    Siamese(String name) {
        super(name);
    }

    @Override
    public void mew() {
        System.out.println("mjauSiamese");
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-3);
        this.mew();
    }

    @Override
    public  void purr() {
        System.out.println("murrSiamese");
    }

    @Override
    public void purr (Person person) {
        person.changeHappiness(3);
        this.purr();
    }
}
