package com.rakovets.course.java.core.practice.oop.principles.project_cat;

public class Siamese extends Cat {

    public Siamese(String name) {
        super(name);
    }

    public String mew() {
        return "Meeew";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(20);
    }

    public String purr() {
        return "Purrr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(5);
    }
}
