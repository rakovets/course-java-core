package com.rakovets.course.challenge.oop.Geometry;

public abstract class Figure implements Area, Perimeter {
    private String name;
    private float x;
    private float y;

    Figure(String name, float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract double CalculetePerimeter();

    public abstract double CalculeteArea();

    public abstract boolean isAreaIsSame(Figure figure);

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}


