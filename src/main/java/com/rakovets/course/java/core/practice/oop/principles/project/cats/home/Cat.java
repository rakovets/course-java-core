package com.rakovets.course.java.core.practice.oop.principles.project.cats.home;

public class Cat {
    private String name;
    private final static int DECREASED_LEVEL_HAPPINESS = -20;
    private final static int INCREASED_LEVEL_HAPPINESS = 20;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "mew";
    }

    public int mew(Person person) {
        return person.changeHappiness(DECREASED_LEVEL_HAPPINESS);
    }

    public String purr() {
        return "purr";
    }

    public int purr(Person person) {
        return person.changeHappiness(INCREASED_LEVEL_HAPPINESS);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

