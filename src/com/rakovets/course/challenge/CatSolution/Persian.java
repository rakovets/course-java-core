package com.rakovets.course.challenge.CatSolution;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    void mew() {
        System.out.println("mewp-mewp-mewp");
    }

    @Override
    void mew(Person james) {
        System.out.println("mewp-mewp-mewp");
        james.takeHappiness(-5);
    }

    @Override
    void purr(){
        System.out.println("purrp-purrp-purrp");
    }

    @Override
    void purr(Person james) {
        System.out.println("purrp-purrp-purrp");
        james.takeHappiness(+10);
    }
}
