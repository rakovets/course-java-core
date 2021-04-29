package com.rakovets.course.java.core.practice.oop.principles.cat;


public class Cat {
    private  String nameCate;
    private final int PERCENT_HAPPINESS = 15;

    public Cat (String nameCate) {
        this.nameCate = nameCate;
    }

    public String getNameCate() {
        return nameCate;
    }

    public void setNameCate(String nameCate) {
        this.nameCate=nameCate;
    }

    public void mew() {
        System.out.println("Mew");
    }

    public void purr() {
        System.out.println("BBrr BBrr");
    }

    public void mew(Person person) {
        person.changeHappiness(-PERCENT_HAPPINESS);
    }

    public void purr(Person person) {
        person.changeHappiness(PERCENT_HAPPINESS);
    }
}
