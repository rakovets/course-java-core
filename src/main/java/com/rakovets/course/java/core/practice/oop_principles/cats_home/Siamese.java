package com.rakovets.course.java.core.practice.oop_principles.cats_home;
class Siamese extends Cat {
    public Siamese(String nameCat) {
        super(nameCat);
    }

    @Override
    public String mew() {
        return "Siamese - mew - me ";
    }

    @Override
    public void mew(Person user) {
        this.mew();
        user.changeHappiness(-10);
    }

    @Override
    public String purr() {
        return "Siamese - purr - purr ";
    }

    @Override
    public void purr(Person user) {
        this.purr();
        user.changeHappiness(10);
    }
}
