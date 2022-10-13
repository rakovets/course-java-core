package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Миу";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-5);
    }

    @Override
    public String purr() {
        return "Мрр";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(+20);
    }
}
