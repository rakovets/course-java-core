package com.rakovets.course.util;

public class Sphynx extends Cat {

    Sphynx(String name) {
        super(name);
    }

    public void mew(Person p) {
        System.out.println("miaaau");
        p.takeHapinness(-29);
    }

    public void purr(Person p) {
        System.out.println("murrr");
        p.takeHapinness(13);
    }
}
