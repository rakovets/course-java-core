package com.rakovets.course.java.core.practice.oop.principles;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "mew-mew";
    }

    public String purr() {
        return "mrrr";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String mew(Person bill) {
        bill.changeHappiness(-10);
        return "mew-mew";
    }

    public String purr(Person bill) {
        bill.changeHappiness(15);
        return "mrrr";
    }
}
