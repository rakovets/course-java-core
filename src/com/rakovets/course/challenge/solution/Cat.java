package com.rakovets.course.challenge.solution;

public class Cat {
    private String name;
    Cat (String name) {
        this.name=name;
    }
    void mew() {
        System.out.println("mew--mew--mew");
    }
    void poor() {
        System.out.println("poor--poor--poor");
    }
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    void mew(Person person) {
        person.takeHappiness(-1);
    }
    void poor(Person person) {
        person.takeHappiness(1);
    }

}
