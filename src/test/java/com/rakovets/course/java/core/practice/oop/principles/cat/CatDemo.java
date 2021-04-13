package com.rakovets.course.java.core.practice.oop.principles.cat;


public class CatDemo {
    public static void main (String[] args) {
        Siamese maru = new Siamese("Maru");
        maru.mew();
        maru.getNameCate();
        Person oleg = new Person(30);
        maru.mew(oleg);
        System.out.println(oleg.getHappiness());
        maru.purr(oleg);
        System.out.println(oleg.getHappiness());
        maru.purr(oleg);
        System.out.println(oleg.getHappiness());
        Cat buul = new Sphynx("Buul");
        buul.mew(oleg);
        System.out.println(oleg.getHappiness());

    }
}
