package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats;

public class Siamese extends Cat {
    private String color;

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Miu-Miu_miu";
    }

    @Override
    public String purr() {
        return "Srrrr_Srrrr";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-20);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(45);
    }
}
