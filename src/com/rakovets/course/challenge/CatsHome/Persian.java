package com.rakovets.course.challenge.CatsHome;

public class Persian extends Cat {

    Persian(String name) {
        super(name);
    }

    Persian() {
    }

    public void mew() {
        System.out.print("Meww mew");
    }

    public void purr() {
        System.out.print("Purrr prr");
    }

    public void mew(Person person) {
        this.mew();
        person.takeHappiness(-15);
    }

    public void purr(Person person) {
        this.purr();
        person.takeHappiness(15);
    }
}
