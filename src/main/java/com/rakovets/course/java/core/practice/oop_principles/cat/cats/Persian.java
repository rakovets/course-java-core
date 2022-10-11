package com.rakovets.course.java.core.practice.oop_principles.cat.cats;

import com.rakovets.course.java.core.practice.oop_principles.cat.Person;
import com.rakovets.course.java.core.practice.oop_principles.cat.cats.Cat;

public class Persian extends Cat {
    private final double percentSadness = -7;
    private final double percentHappiness = 20;

    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mya-mya-mya";
    }

    @Override
    public void mew(Person man) {
        man.changeHappiness(percentSadness);
    }

    @Override
    public String purr() {
        return "murr-murr-murr";
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
