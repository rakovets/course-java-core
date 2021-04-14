package com.rakovets.course.java.core.practice.oop.principles.project.cats.home;

public class Sphynx extends Cat{
    public Sphynx(String name) {
        super(name);
    }



    @Override
    public String mew() {
        return "myaaaw";
    }



    @Override
    public String purr() {
        return "frrRr";
    }


    @Override
    public int mew(Person person) {
        return person.changeHappiness(0);
    }



    public int purr(Person person) {
        return person.changeHappiness(0);
    }
}
