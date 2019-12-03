package com.rakovets.course.challenge.CatSolution;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    // методы туть
    void mew() { System.out.println("mew-mew-mew"); }

    void mew(Person james) {
        System.out.println("mew-mew-mew");
        james.takeHappiness(-8);
    }

    void purr(){ System.out.println("purr-purr-purr"); }

    void purr(Person james){
        System.out.println("purr-purr-purr");
        james.takeHappiness(+8);
    }

    String getName() {
        return ("Cat's name is " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
