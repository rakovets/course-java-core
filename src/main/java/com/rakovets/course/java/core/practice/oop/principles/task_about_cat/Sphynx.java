package com.rakovets.course.java.core.practice.oop.principles.task_about_cat;

import com.rakovets.course.java.core.practice.oop.principles.task_about_cat.Cat;
import com.rakovets.course.java.core.practice.oop.principles.task_about_cat.Person;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    public Sphynx() {}

    @Override
    public String mew() {
        return "mjay-mjay";
    }

    @Override
    public String purr() {
        return "mrr-mrr-mrr";
    }

    @Override
    public double mew(Person person) {
        return person.changeHappiness() - 0.5 * Math.abs(person.getPercentHappiness());
    }

    @Override
    public double purr(Person person) {
        return person.changeHappiness() - 0.2 * Math.abs(person.getPercentHappiness());
    }
}
