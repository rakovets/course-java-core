package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

class Siamese extends Cat {
    private String color;

    Siamese(String name) {
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
}
