package com.rakovets.course.java.core.practice.oop.principles.сats_home;

public class Cat {
    private String name;

    public Cat (String name) {
        this.name = name;
    }

    public String mew() {
        return "meeeow";
    }

    public String purr() {
        return "prrr-prrr";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void mew(Person random) {
        random.changeHappiness(-25.0);
    }

    public void purr(Person random) {
        random.changeHappiness(+25.0);
    }
}
