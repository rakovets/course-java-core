package com.rakovets.course.java.core.practice.oop_principles.cats_home.cats;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.Person;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String catMew() {
        return "MEW-mew";
    }

    @Override
    public String catMew(Person user) {
        user.changeHappiness(-40);
        return "mewmew";
    }

    @Override
    public String catPurr() {
        return "ururu-ururu";
    }

    @Override
    public String catPurr(Person user) {
        user.changeHappiness(1);
        return "uuuurrrrruuuu";
    }
}
