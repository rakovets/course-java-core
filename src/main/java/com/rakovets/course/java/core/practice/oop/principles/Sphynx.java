package com.rakovets.course.java.core.practice.oop.principles;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mjay-mjay";
    }

    @Override
    public String purr() {
        return "mrr-mrr-mrr";
    }
}
