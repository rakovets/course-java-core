package com.rakovets.course.java.core.practice.oop.principles.cat_home;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "meow";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-5);
        mew();
    }

    @Override
    public String purr() {
        return "mrrrrrrmmmr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(70);
        purr();
    }
}
