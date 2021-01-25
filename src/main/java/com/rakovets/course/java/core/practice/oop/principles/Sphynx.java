package com.rakovets.course.java.core.practice.oop.principles;

public class Sphynx extends Cat{
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew(){
        return "mew-sfi";
    }

    @Override
    public String purr() {
        return "mrrr-sfi";
    }
}
