package com.rakovets.course.java.core.practice.oop.principles.project.cats.home;

public class Persian extends Cat{
    public Persian(String name) {
        super(name);
    }



    @Override
    public String mew() {
        return "maaaww";
    }



    @Override
    public String purr() {
        return "mrrrr";
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
