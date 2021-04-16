package com.rakovets.course.java.core.practice.oop.principles.task_about_cat;

import com.rakovets.course.java.core.practice.oop.principles.task_about_cat.Cat;
import com.rakovets.course.java.core.practice.oop.principles.task_about_cat.Person;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    public Siamese() {}

    @Override
    public String mew() {
        return "mey-mey";
    }

    @Override
    public String purr() {
        return "prr-prr-prr";
    }

    @Override
    public double mew(Person person) {
        return person.changeHappiness() - 0.2 * Math.abs(person.getPercentHappiness());
    }

    @Override
    public double purr(Person person) {
        return person.changeHappiness() + 0.2 * Math.abs(person.getPercentHappiness());
    }
}
