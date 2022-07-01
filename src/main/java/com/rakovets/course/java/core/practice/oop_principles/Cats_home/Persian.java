package com.rakovets.course.java.core.practice.oop_principles.Cats_home;

class Persian extends Cat {

    public Persian(String nameCat) {
        super(nameCat);
    }

    @Override
    public String mew() {
        return "Persian - mew - mew ";
    }

    @Override
    public void mew(Person user) {
        this.mew();
        user.changeHappiness(-20);
    }

    @Override
    public String purr() {
        return "Persian - purr - purr ";
    }

    @Override
    public void purr(Person user) {
        this.purr();
        user.changeHappiness(20);
    }
}
