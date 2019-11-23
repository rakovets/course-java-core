package com.rakovets.course.challenge.CatSolution;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    void mew() {
        System.out.println("mewx-mewx-mewx");
    }

    @Override
    void mew(Person james) {
        System.out.println("mewx-mewx-mewx");
        james.takeHappiness(-5);
    }

    @Override
    void purr(){
        System.out.println("purrx-purrx-purrx");
    }

    @Override
    void purr(Person james) {
        System.out.println("purrx-purrx-purrx");
        james.takeHappiness(+15);
    }
}
