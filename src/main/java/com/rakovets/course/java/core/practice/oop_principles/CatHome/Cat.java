package com.rakovets.course.java.core.practice.oop_principles.CatHome;

public class Cat {
    protected int mewValue = -10;
    protected int purrValue = 10;
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int mewValue, int purrValue) {
        this.mewValue = mewValue;
        this.purrValue = purrValue;
        this.name = name;
    }

    public int getMewValue() {
        return mewValue;
    }

    public int getPurrValue() {
        return purrValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String mew() {
        return "Mew";
    }

    public String mew(Person user) {
        user.changeHappiness(mewValue);
        return mew();
    }

    public String purr() {
        return "Purr";
    }

    public String purr(Person user) {
        user.changeHappiness(purrValue);
        return purr();
    }
}
