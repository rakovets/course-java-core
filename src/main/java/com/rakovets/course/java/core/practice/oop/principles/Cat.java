package com.rakovets.course.java.core.practice.oop.principles;

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
     public String getName() {
         return this.name;
     }
     public void setName(String name) {
        this.name = name;
    }
    public String mew(Person user) {
        user.changeHappiness(-20);
        return "Mew";
    }
    public String purr(Person user) {
        user.changeHappiness(20);
        return "Purr";
    }
}
