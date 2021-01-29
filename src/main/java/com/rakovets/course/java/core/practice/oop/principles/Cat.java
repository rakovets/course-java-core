package com.rakovets.course.java.core.practice.oop.principles;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "mew-mew";
    }

    public String purr() {
        return "mrrr";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String mew(Person name) {
        name.changeHappiness(-10);
        return mew();
    }

    public String purr(Person name) {
        name.changeHappiness(15);
        return purr();
    }
}
