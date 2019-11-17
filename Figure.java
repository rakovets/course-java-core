package com.rakovets.course.challenge.oopInheritanceAndPolymorphism;

public class Figure {
    String name;
    int a;
    int b;
    int h;
    int r;

    Figure (String name) {
        this.name = name;
    }

    void square(int a, int b) {
        System.out.println("rectangle's square: " + a * b);
    }

    void square1(int a, int h) {
        System.out.println("triangle's square: " + (a * h) / 2);
    }

    void square2(int r) {
        System.out.println("circle's square: " + Math.PI * r * r);
    }


    void display() {
        System.out.printf("Figure: %s\n", this.name);
    }
}
