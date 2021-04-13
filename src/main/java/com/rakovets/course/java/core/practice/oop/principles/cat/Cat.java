package com.rakovets.course.java.core.practice.oop.principles.cat;


public class Cat {
    private  String nameCate;

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
        person.changeHappiness(-15);
    }
    public void purr(Person person) {
        person.changeHappiness(15);
    }
}
