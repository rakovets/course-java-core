package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Мяу-мяу";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-25);
    }

    @Override
    public String purr() {
        return "Мурр-мур";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(+10);
    }
}
