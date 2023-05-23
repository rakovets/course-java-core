package com.rakovets.course.java.core.practice.oop_principles.CatsHome;

public class Cat {
        private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "mew-mew";
    }

    public String purr() {
        return "purr-purr.....";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void mew(Person person) {
        person.changeHappiness(-10);
        System.out.println("MEOW!!!!!");
    }

    public void purr(Person person) {
        person.changeHappiness(5);
        System.out.println("Purr... purrr");
    }
}


