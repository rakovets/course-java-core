package com.rakovets.course.java.core.practice.oop_principles.cats;

public   class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    protected String catMeows() {
        return "Meow";
    }

    @Override
    protected double catMeows(Person user) {
        return user.changeHappiness(-10);
    }

    @Override
    protected String catPurrs() {
        return "Purr";
    }

    @Override
    protected double catPurrs(Person user) {
        return user.changeHappiness(+5);
    }
}
