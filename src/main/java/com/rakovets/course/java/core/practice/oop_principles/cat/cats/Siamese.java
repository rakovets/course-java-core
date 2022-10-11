package com.rakovets.course.java.core.practice.oop_principles.cat.cats;

import com.rakovets.course.java.core.practice.oop_principles.cat.Person;
import com.rakovets.course.java.core.practice.oop_principles.cat.cats.Cat;

public class Siamese extends Cat {
    private final double percentSadness = -10.5;
    private final double percentHappiness = 15;

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Miaau-miaau";
    }

    @Override
    public void mew(Person man) {
        man.changeHappiness(percentSadness);
    }

    @Override
    public String purr() {
        return "prr-prr-prr";
    }

    @Override
    public void purr(Person man) {
        man.changeHappiness(percentHappiness);
    }

    @Override
    public double getPercentHappiness() {
        return percentHappiness;
    }

    @Override
    public double getPercentSadness() {
        return percentSadness;
    }
}
