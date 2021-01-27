package com.rakovets.course.java.core.practice.oop.principles;

public class Sphynx extends Cat{

    public Sphynx(String name) {
        super(name);
    }

    public String mew() {
        return "Mew-mew-mew";
    }
    public String purr() {
        return "Purr-purr-purr";
    }

    public String mew(Person user) {
        user.changeHappiness(-80);
        return "Mew-mew-mew";
    }

     public String purr(Person user) {
        user.changeHappiness(-80);
        return "Purr-purr-purr";
    }
}
