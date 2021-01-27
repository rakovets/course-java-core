package com.rakovets.course.java.core.practice.oop.principles;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew(){
        return "mew-pers";
    }

    @Override
    public String purr() {
        return "mrrr-pers";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(16);
        return "mew-sim";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(-16);
        return "mrrr-sim";
    }
}
