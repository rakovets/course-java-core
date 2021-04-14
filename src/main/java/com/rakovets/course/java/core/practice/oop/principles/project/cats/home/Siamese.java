package com.rakovets.course.java.core.practice.oop.principles.project.cats.home;

public class Siamese extends Cat{
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "MEOWWW";
    }


    @Override
    public String purr() {
        return "FURR";
    }



    @Override
    public int mew(Person person) {
        return person.changeHappiness(0);
    }



    @Override
    public int purr(Person person) {
        return person.changeHappiness(0);
    }
}
