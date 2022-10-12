package com.rakovets.course.java.core.practice.oop_principles.cat.cats;

import com.rakovets.course.java.core.practice.oop_principles.cat.Person;
import com.rakovets.course.java.core.practice.oop_principles.cat.cats.Cat;

public class Sphynx extends Cat {
    private final double PERCENT_SADNESS = -25;
    private final double PERCENT_HAPPINESS = 8.5;

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meww-meww-mewww";
    }

    @Override
    public void mew(Person man) {
        man.changeHappiness(PERCENT_SADNESS);
    }

    @Override
    public String purr() {
        return "prr-mrr-prr-mrr";
    }

    @Override
    public void purr(Person man) {
        man.changeHappiness(PERCENT_HAPPINESS);
    }

    @Override
    public double getPercentSadness() {
        return PERCENT_SADNESS;
    }

    @Override
    public double getPercentHappiness() {
        return PERCENT_HAPPINESS;
    }
}
