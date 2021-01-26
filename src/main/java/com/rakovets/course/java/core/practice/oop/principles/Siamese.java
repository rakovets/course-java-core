package com.rakovets.course.java.core.practice.oop.principles;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew(){
        return "mew-sim";
    }

    @Override
    public String purr() {
        return "mrrr-sim";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(13);
        return "mew-sim";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(-13);
        return "mrrr-sim";
    }
}
