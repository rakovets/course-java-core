package com.rakovets.course.java.core.practice.oop_principles.cat_home;
public class Cat {
    private String name;

    public final int PERCENT_OF_HAPPINESS = 10;

    Cat(String name) {
        this.name = name;
    }

    public void mew() {
        System.out.println("meew");
    }

    public void mew(Person person, double happiness) {
        person.changeHappiness(happiness);
    }

    public void purr() {
        System.out.println("purr");
    }

    public void purr(Person person, double happiness) {
        person.changeHappiness(happiness);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
