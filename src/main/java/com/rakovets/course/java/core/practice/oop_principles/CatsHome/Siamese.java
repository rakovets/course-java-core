package com.rakovets.course.java.core.practice.oop_principles.CatsHome;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Maoooooooooow!";
    }

    @Override
    public String purr() {
        return "purrssssssss";
    }
}
