package com.rakovets.course.java.core.practice.oop.principles;

public class Persian extends Cat{
    public Persian(String name) {
        super(name);
    }

    @Override
    public String catSayMew() {
        return "MEOW";
    }

    @Override
    public String catPurr() {
        return "MUURRR";
    }

    @Override
    public void catSayMew(Person person) {
        person.changeHappiness(-15);
    }

    @Override
    public void catPurr(Person person) {
        person.changeHappiness(100);
    }
}
