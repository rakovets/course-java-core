package com.rakovets.course.java.core.practice.oop_principles.cats_home.cats;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.Person;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String catMew() {
        return "MEW";
    }

    @Override
    public String catMew(Person user) {
        user.changeHappiness(-30);
        return "mmmmmeeewwww";
    }

    @Override
    public String catPurr() {
        return "ururu";
    }

    @Override
    public String catPurr(Person user) {
        user.changeHappiness(50);
        return "uru-uru-ururu";
    }
}
