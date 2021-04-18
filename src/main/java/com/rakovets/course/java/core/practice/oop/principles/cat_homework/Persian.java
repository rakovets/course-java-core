package com.rakovets.course.java.core.practice.oop.principles.cat_homework;

public class Persian extends Cat {
    public Persian (String name) {
        super(name);
    }
    @Override
    public String mew() {
        return "Mew-Mew";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-10);
    }

    @Override
    public String purr() {
        return "purr-purr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(100);
    }
}
