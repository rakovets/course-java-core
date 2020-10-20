package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

class Siamese extends Cat {
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
}
