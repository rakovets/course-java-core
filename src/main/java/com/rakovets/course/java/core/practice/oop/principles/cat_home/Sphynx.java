package com.rakovets.course.java.core.practice.oop.principles.cat_home;

public class Sphynx extends Cat {
    private final double PERCENTHAPPINESS_MEW = -50.0;
    private final double PERCENTHAPPINESS_PURR = 50.0;

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Sphynx mew";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(PERCENTHAPPINESS_MEW);
    }

    @Override
    public String purr() {
        return "Sphynx purr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(PERCENTHAPPINESS_PURR);
    }
}
