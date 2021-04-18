package com.rakovets.course.java.core.practice.oop.principles.cat_homework;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "UUUAaaaaa";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-150);
    }

    @Override
    public String purr() {
        return "Shhh";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(10);
    }
}
