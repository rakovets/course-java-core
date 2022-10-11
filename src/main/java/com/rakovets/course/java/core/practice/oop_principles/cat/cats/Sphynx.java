package com.rakovets.course.java.core.practice.oop_principles.cat.cats;

import com.rakovets.course.java.core.practice.oop_principles.cat.Person;
import com.rakovets.course.java.core.practice.oop_principles.cat.cats.Cat;

public class Sphynx extends Cat {
    private final double percentSadness = -25;
    private final double percentHappiness = 8.5;

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meww-meww-mewww";
    }

    @Override
    public void mew(Person man) {
        man.changeHappiness(percentSadness);
    }

    @Override
    public String purr() {
        return "prr-mrr-prr-mrr";
    }

    @Override
    public void purr(Person man) {
        man.changeHappiness(percentHappiness);
    }

    @Override
    public double getPercentSadness() {
        return percentSadness;
    }

    @Override
    public double getPercentHappiness() {
        return percentHappiness;
    }
}
