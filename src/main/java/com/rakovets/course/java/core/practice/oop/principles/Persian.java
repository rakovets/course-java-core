package com.rakovets.course.java.core.practice.oop.principles;

public class Persian extends Cat {
    Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Персидский Мяу тебе";
    }

    @Override
    public String purr() {
        return "Персидский Мур тебе";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-1);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(+1);
    }
}
