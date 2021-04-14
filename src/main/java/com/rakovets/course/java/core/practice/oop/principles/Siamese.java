package com.rakovets.course.java.core.practice.oop.principles;

public class Siamese extends Cat {


    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "May-May";
    }

    @Override
    public String purr() {
        return "Myp-Myp";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-5);
        return mew();
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(+5);
        return purr();
    }
}
