package com.rakovets.course.challenge.CatSolution;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    void mew() {
        System.out.println("mews-mews-mews");
    }

    @Override
    void mew(Person james) {
        System.out.println("mews-mews-mews");
        james.takeHappiness(-10);
    }

    @Override
    void purr(){
        System.out.println("purrs-purrs-purrs");
    }

    @Override
    void purr(Person james) {
        System.out.println("purrs-purrs-purrs");
        james.takeHappiness(+5);
    }
}
