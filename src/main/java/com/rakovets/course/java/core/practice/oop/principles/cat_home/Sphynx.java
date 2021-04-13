package com.rakovets.course.java.core.practice.oop.principles.cat_home;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "meeeee - o - O-o - o - O - w";
    }

    @Override
    public String purr() {
        return "murrrrrrsssmmm";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-70);
        mew();
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(20);
        purr();
    }
}
