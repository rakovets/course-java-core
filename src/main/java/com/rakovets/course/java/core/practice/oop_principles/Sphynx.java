package com.rakovets.course.java.core.practice.oop_principles;

public class Sphynx extends Cat {
    Sphynx(String name) {
        super(name);
    }

    @Override
    public void mew() {
        System.out.println("mjauSphynx");
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-4);
        this.mew();
    }

    @Override
    public  void purr() {
        System.out.println("murrSphynx");
    }

    @Override
    public void purr (Person person) {
        person.changeHappiness(4);
        this.purr();
    }
}
