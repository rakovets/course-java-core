package com.rakovets.course.java.core.practice.oop.principles.cat;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "Mew";
    }

    public String purr() {
        return "Purr";
    }

    public String mew(Person person) {
        person.changeHappiness(-15);
        return mew();
    }

    public String purr(Person person) {
        person.changeHappiness(+15);
        return purr();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
