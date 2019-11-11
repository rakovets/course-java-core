package com.rakovets.course.challenge.oop.Geometry;

public abstract class Triangle implements Area {
    private String name;

    public Triangle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void GetArea();

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                '}';
    }
}
