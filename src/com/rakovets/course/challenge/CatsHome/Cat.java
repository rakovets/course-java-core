package com.rakovets.course.challenge.CatsHome;

public class Cat {

    public String name;

    Cat(String name) {
        this.name = name;
    }

    Cat() {
    }

    public void mew() {
        System.out.println("Mew");
    }

    public void purr() {
        System.out.println("Purr");
    }

    public void mew(Person person) {
        this.mew();
        person.takeHappiness(-5);
    }

    public void purr(Person person) {
        this.purr();
        person.takeHappiness(5);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
