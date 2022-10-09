package com.rakovets.course.java.core.practice.oop_principles.cats_home.cat_types;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats_and_person.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats_and_person.Person;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mew mew mew";
    }

    @Override
    public double mew(Person user) {
        return user.changeHappiness(-20.0);
    }

    @Override
    public String purr() {
        return "Purr purr purr";
    }

    @Override
    public double purr(Person user) {
        return user.changeHappiness(20.0);
    }
}
