package com.rakovets.course.java.core.practice.oop_principles.cats_home.cats;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.Person;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String catMew() {
        return "meeew-meew";
    }

    @Override
    public String catMew(Person user) {
        user.changeHappiness(-20);
        return "memewww-memewww";
    }

    @Override
    public String catPurr() {
        return "puurrruru";
    }

    @Override
    public String catPurr(Person user) {
        user.changeHappiness(20);
        return "pururu";
    }
}
