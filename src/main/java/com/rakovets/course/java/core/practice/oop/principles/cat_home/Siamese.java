package com.rakovets.course.java.core.practice.oop.principles.cat_home;

public class Siamese extends Cat {
    private final double PERCENTHAPPINESS_MEW = -15.0;
    private final double PERCENTHAPPINESS_PURR = 15.0;

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Siamese mew";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(PERCENTHAPPINESS_MEW);
    }

    @Override
    public String purr() {
        return "Siamese purr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(PERCENTHAPPINESS_PURR);
    }
}
