package com.rakovets.course.java.core.practice.oop.principles.task01;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "MEEEEEEEEEEWWWWWWWWW";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-55.5);
    }

    @Override
    public String purr() {
        return "PPPPPPRRRPRPRPRPPR";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(1.5);
    }
}
