package com.rakovets.course.java.core.practice.oop_principles.cats_home.cat_types;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats_and_person.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats_and_person.Person;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meeeew Meeeew Meeeew";
    }

    @Override
    public double mew(Person user) {
        return user.changeHappiness(-30.0);
    }

    @Override
    public String purr() {
        return "Purrrr Purrrr Purrrr";
    }

    @Override
    public double purr(Person user) {
        return user.changeHappiness(30.0);
    }
}
