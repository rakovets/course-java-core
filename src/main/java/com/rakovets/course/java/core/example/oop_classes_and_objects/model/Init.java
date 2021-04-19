package com.rakovets.course.java.core.example.oop_classes_and_objects.model;

public class Init {
    {
        System.out.println("initializer order: 1, id=" + this.id);
    }

    public int id = 42;

    public Init(int d) {
        this.id = d;
        System.out.println("constructor: id=" + this.id);
    }

    {
        System.out.println("initializer order: 2, id=" + this.id);
    }

    static {
        System.out.println("static initializer");
    }

    {
        this.id = 10;
        System.out.println("initializer order: 3, id=" + this.id);
    }
}
