package com.rakovets.course.java.core.practice.oop.principles.cat_home;

public class Persian extends Cat {

    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Persian mew";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-25.0);
    }

    @Override
    public String purr() {
        return "Persian purr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(+25.0);
    }
}
