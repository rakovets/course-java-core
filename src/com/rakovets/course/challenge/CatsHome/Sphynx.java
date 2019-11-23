package com.rakovets.course.challenge.CatsHome;

public class Sphynx extends Cat {

    Sphynx(String name) {
        super(name);
    }

    Sphynx() {
    }

    public void mew() {
        System.out.print("Meeww meeew");
    }

    public void purr() {
        System.out.print("Prrrr Puurrr");
    }

    public void mew(Person person) {
        this.mew();
        person.takeHappiness(-10);
    }

    public void purr(Person person) {
        this.purr();
        person.takeHappiness(10);
    }
}
