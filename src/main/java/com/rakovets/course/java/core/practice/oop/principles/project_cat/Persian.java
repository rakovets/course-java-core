package com.rakovets.course.java.core.practice.oop.principles.project_cat;

public class Persian extends Cat {

    public Persian(String name) {
        super(name);
    }

    public String mew() {
        return "Meeew - meeew";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(10);
    }


    public String purr() {
        return "Purrr - purrr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(-10);
    }
}

