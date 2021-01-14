package com.rakovets.course.java.core.example.oop.classesandobjects.model;

public class Init {
    {
        System.out.println("initializer (1), id=" + this.id);
    }

    private int id = 42;

    public Init(int d) {
        id = d;
        System.out.println("constructor, id=" + id);
    }

    {
        System.out.println("initializer (2), id=" + this.id);
    }

    static {
        System.out.println("static initializer");
    }

    public int getId() {
        return id;
    }

    {
        id = 10;
        System.out.println("initializer (3), id=" + id);
    }
}
