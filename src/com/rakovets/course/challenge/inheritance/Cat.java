package com.rakovets.course.challenge.inheritance;

public class Cat {
    private String name;

    Cat(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void mew(Person person){
        System.out.println("mew");
        person.takeHappiness(-10);
    }

    public void purr(Person person){
        System.out.println("purr");
        person.takeHappiness(10);
    }
}
