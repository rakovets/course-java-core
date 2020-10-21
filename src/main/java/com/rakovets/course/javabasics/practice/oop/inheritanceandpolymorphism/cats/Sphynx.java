package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats;

public class Sphynx extends Cat {

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Miihha";
    }

    @Override
    public String purr() {
        return "Sphrrrr_mummia-Raaaarrsss";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-100);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(150);
    }
}
