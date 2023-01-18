package com.rakovets.course.java.core.practice.oop_principles;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mnew-mnew";
    }

    @Override
    public int mew(Person person) {
        return person.changeHappiness(-3);
    }

    @Override
    public String purr() {
        return "Prr-prr";
    }

    public int purr(Person person) {
        return person.changeHappiness(3);
    }
}
