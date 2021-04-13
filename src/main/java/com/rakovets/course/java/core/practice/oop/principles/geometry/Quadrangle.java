package com.rakovets.course.java.core.practice.oop.principles.geometry;

public abstract class Quadrangle extends Figure implements Perimeter{

    public Quadrangle(String name) {
        super(name);
    }

    public abstract double[] findDiagonal();
}
