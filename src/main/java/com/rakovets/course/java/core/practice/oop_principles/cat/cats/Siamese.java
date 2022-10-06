package com.rakovets.course.java.core.practice.oop_principles.cat.cats;

import com.rakovets.course.java.core.practice.oop_principles.cat.Person;
import com.rakovets.course.java.core.practice.oop_principles.cat.cats.Cat;

public class Siamese extends Cat {

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Miaau-miaau";
    }

    @Override
    public void mew(Person man) {
        double percentHappiness = -10.5;
        man.changeHappiness(percentHappiness);
    }

    @Override
    public String purr() {
        return "prr-prr-prr";
    }

    @Override
    public void purr(Person man) {
        double percentHappiness = 15;
        man.changeHappiness(percentHappiness);
    }
}
