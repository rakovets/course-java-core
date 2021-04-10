package com.rakovets.course.java.core.practice.oop.principles;

public class Sphynx extends Cat {
    Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Убей меня!";
    }

    @Override
    public String purr() {
        return "Причини мне боль!";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-7);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(+8);
    }
}
