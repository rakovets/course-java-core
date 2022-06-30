package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat {
    Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Siamese: meow-meow-meow";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-5);
        return "Siamese " + getName() + ": meow-Master-meow";
    }

    @Override
    public String purr() {
        return "Siamese: purr-purr-purr";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(10);
        return "Siamese: purr-purr-purr";
    }
}
