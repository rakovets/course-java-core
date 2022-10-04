package com.rakovets.course.java.core.practice.oop_principles.cat;

public class Persian extends Cat{

    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mya-mya-mya";
    }

    @Override
    public void mew(Person man) {
        double percentHappiness = -7;
        man.changeHappiness(percentHappiness);
    }

    @Override
    public String purr() {
        return "murr-murr-murr";
    }

    @Override
    public void purr(Person man) {
        double percentHappiness = 20;
        man.changeHappiness(percentHappiness);
    }
}
