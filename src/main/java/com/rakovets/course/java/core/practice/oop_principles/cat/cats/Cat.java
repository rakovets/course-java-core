package com.rakovets.course.java.core.practice.oop_principles.cat.cats;

import com.rakovets.course.java.core.practice.oop_principles.cat.Person;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "mew-mew";
    }

    public void mew(Person man) {
        double percentHappiness = -5;
        man.changeHappiness(percentHappiness);
    }

    public String purr() {
        return "purrr-purrr-purrr";
    }

    public void purr(Person man) {
        double percentHappiness = 5;
        man.changeHappiness(percentHappiness);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
