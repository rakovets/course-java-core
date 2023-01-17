package com.rakovets.course.java.core.practice.oop_principles.catshome;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mau, mau, mau!";
    }

    @Override
    public String purr() {
        return "Purrr...purrr...";
    }
}
