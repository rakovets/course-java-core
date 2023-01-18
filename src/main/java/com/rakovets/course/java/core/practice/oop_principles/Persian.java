package com.rakovets.course.java.core.practice.oop_principles;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mew in persian";
    }

    @Override
    public int mew(Person person) {
        return person.changeHappiness(-2);
    }

    @Override
    public String purr() {
        return "Mrr in persian";
    }

    @Override
    public int purr(Person person) {
        return person.changeHappiness(2);
    }
}
