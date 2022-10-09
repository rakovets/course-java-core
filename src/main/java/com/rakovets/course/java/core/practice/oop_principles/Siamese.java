package com.rakovets.course.java.core.practice.oop_principles;

public class Siamese extends Cat {
    Siamese(String name) {
        super(name);
    }

    @Override
    public void mew() {
        System.out.println("mjauSiamese");
    }
}
