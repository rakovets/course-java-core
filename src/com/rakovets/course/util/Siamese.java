package com.rakovets.course.util;

class Siamese extends Cat {

    Siamese(String name) {
        super(name);
    }

    public void mew(Person p) {
        System.out.println("mau");
        p.takeHapinness(-11);
    }

    public void purr(Person p) {
        System.out.println("mrrr");
        p.takeHapinness(23);
    }
}
