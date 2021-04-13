package com.rakovets.course.java.core.practice.oop.principles.geometry;

public abstract class Figure {
    private String name;
    public Figure(String name) {
        this.name = name;
    }

    public abstract double findArea();

    public String getName() {
        return name;
    }

    public boolean findArea(Figure figure) {
        return figure.findArea() == this.findArea();
    }
}
