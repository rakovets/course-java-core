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
       return "purr-purr-purr";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

