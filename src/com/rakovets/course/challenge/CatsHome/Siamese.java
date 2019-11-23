package com.rakovets.course.challenge.CatsHome;

public class Siamese extends Cat {

    Siamese(String name) {
        super(name);
    }

    Siamese() {
    }

    public void mew() {
        System.out.print("Mew mew mew");
    }

    public void purr() {
        System.out.print("Pur pur pur");
    }

    public void mew(Person person) {
        this.mew();
        person.takeHappiness(-20);
    }

    public void purr(Person person) {
        this.purr();
        person.takeHappiness(20);
    }
}
