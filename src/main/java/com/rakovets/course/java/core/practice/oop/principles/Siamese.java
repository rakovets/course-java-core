package com.rakovets.course.java.core.practice.oop.principles;

public class Siamese extends Cat {

    public Siamese(String name) {
        super(name);
    }

    public String mew() {
        return "Mew-mew";
    }

    public String purr() {
        return "Purr-purr";
    }

    public String mew(Person user) {
        user.changeHappiness(-20);
        return "Mew-mew";
    }

    public String purr(Person user) {
        user.changeHappiness(20);
        return "Purr-purr";
    }
}


