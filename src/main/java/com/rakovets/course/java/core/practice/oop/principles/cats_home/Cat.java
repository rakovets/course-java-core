package com.rakovets.course.java.core.practice.oop.principles.cats_home;

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

    public String mew(Person random) {
        random.changeHappiness(-25.0);
        return mew();
    }

    public String purr(Person random) {
        random.changeHappiness(25.0);
        return purr();
    }
}
