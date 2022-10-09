package com.rakovets.course.java.core.practice.oop_principles;

public class Persian extends Cat {

    Persian(String name) {
        super(name);
    }

    @Override
    public void mew() {
        System.out.println("mjauPersian");
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-2);
        this.mew();
    }

    @Override
    public  void purr() {
        System.out.println("murrPersian");
    }

    @Override
    public void purr (Person person) {
        person.changeHappiness(2);
        this.purr();
    }
}
