package com.rakovets.course.java.core.practice.oop.principles;

public class Sphynx extends Cat{
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew(){
        return "mew-sfi";
    }

    @Override
    public String purr() {
        return "mrrr-sfi";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(18);
        return "mew-sim";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(-18);
        return "mrrr-sim";
    }
}
