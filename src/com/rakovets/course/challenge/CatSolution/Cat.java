package com.rakovets.course.challenge.CatSolution;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    // методы туть
    void mew() {
        System.out.println("Cat ==> 'MEW' ");
    }

    void purr(){
        System.out.println("Cat ==> 'PURR'");
    }

    String getName() {
        return ("Cat's name is " + name);
    }

    void setName(String name) {
        this.name = name;
    }
}
