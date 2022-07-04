package com.rakovets.course.java.core.practice.oop_principles.cats_home;

class Sphynx extends Cat {
    public Sphynx(String nameCat) {
        super(nameCat);
    }

    @Override
    public String mew() {
        return "Sphynx - mew - mew ";
    }

    @Override
    public void mew(Person user) {
        this.mew();
        user.changeHappiness(-30);
    }

    @Override
    public String purr() {
        return "Sphynx - purr - purr ";
    }

    @Override
    public void purr(Person user) {
        this.purr();
        user.changeHappiness(30);
    }
}
