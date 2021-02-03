package com.rakovets.course.java.core.practice.oop.principles.cat_home;

public class Persian extends Cat {
    private final double PERCENTHAPPINESS_MEW = -25.0;
    private final double PERCENTHAPPINESS_PURR = 25.0;

    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Persian mew";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(PERCENTHAPPINESS_MEW);
    }

    @Override
    public String purr() {
        return "Persian purr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(PERCENTHAPPINESS_PURR);
    }
}
