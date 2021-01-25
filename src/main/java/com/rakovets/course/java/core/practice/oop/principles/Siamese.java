package com.rakovets.course.java.core.practice.oop.principles;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew(){
        return "mew-sim";
    }

    @Override
    public String purr() {
        return "mrrr-sim";
    }
}
