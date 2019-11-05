package com.rakovets.course.util;

public class Home {
    public static void main(String[] args) {
        Person Sam = new Person(30);
        Cat cat1 = new Cat("Garfield");
        cat1.purr(Sam);
        cat1.mew(Sam);
        Cat cat2 = new Siamese("Kai");
        cat2.mew(Sam);
        cat2.purr(Sam);
        cat1.mew(Sam);
        cat1.mew(Sam);
        cat1.mew(Sam);
        cat1.mew(Sam);

    }
}
