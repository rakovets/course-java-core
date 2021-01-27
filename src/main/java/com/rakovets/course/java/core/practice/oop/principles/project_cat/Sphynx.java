package com.rakovets.course.java.core.practice.oop.principles.project_cat;

public class Sphynx extends Cat {

    public Sphynx(String name) {
        super(name);
    }

    public String mew() {
        return "Mew - mew";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-30);
    }

    public String purr() {
        return "Purr - purr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(30);
    }
 }
