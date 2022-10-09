package com.rakovets.course.java.core.practice.oop_principles.cats_home.cat_types;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats_and_person.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats_and_person.Person;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meeeeeeew";
    }

    @Override
    public double mew(Person user) {
        return user.changeHappiness(-10.0);
    }

    @Override
    public String purr() {
        return "Purrrrrrrrr";
    }

    @Override
    public double purr(Person user) {
        return user.changeHappiness(10.0);
    }
}
