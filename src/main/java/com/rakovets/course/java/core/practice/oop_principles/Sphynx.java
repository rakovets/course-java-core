package com.rakovets.course.java.core.practice.oop_principles;

public class Sphynx extends Cat {
    Sphynx(String name) {
        super(name);
    }

    @Override
    public void mew() {
        System.out.println("mjauSphynx");
    }

    @Override
    public  void purr() {
        System.out.println("murrSphynx");
    }
}
