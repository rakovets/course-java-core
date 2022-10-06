package com.rakovets.course.java.core.practice.oop_principles.cat.cats;

import com.rakovets.course.java.core.practice.oop_principles.cat.Person;
import com.rakovets.course.java.core.practice.oop_principles.cat.cats.Cat;

public class Sphynx extends Cat {

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meww-meww-mewww";
    }

    @Override
    public void mew(Person man) {
        double percentHappiness = -25;
        man.changeHappiness(percentHappiness);
    }

    @Override
    public String purr() {
        return "prr-mrr-prr-mrr";
    }

    @Override
    public void purr(Person man) {
        double percentHappiness = 8.5;
        man.changeHappiness(percentHappiness);
    }
}
