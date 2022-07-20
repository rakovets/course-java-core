package com.rakovets.course.java.core.practice.oop_principles.cat_home;
public class Cat {
    private String name;
    private double givenHappinese;

    public Cat(String name, double givenHappinese) {
        this.name = name;
        this.givenHappinese = givenHappinese;
    }

    public void mew() {
        System.out.println("meew");
    }

    public void mew(Person person) {
        person.changeHappiness(getGivenHappinese());
    }

    public void purr() {
        System.out.println("purr");
    }

    public void purr(Person person) {
        person.changeHappiness(getGivenHappinese());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGivenHappinese() {
        return givenHappinese;
    }
}
