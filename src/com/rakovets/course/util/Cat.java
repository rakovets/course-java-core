package com.rakovets.course.util;

public class Cat {
    String name;

    Cat(String name) {
        this.name = name;
    }

    void mew(Person p) {
        System.out.println("miau");
        p.takeHapinness(-13);
    }

    void  purr(Person p) {
        System.out.println("murrr");
        p.takeHapinness(20);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
