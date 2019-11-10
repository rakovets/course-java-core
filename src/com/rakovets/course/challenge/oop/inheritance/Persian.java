package com.rakovets.course.challenge.oop.inheritance;

public class Persian extends Cat {

    Persian(String name) {
        super(name);
    }

    public void mew(Person p) {
        System.out.println("mia");
        p.takeHapinness(-3);
    }

    public void purr(Person p) {
        System.out.println("mrr");
        p.takeHapinness(9);
    }
}
