package com.rakovets.course.java.core.practice.oop_principles.geometryTest;

public class Rectangle extends Square {
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return getSideA() * getSideB();
    }

    @Override
    public double perimeter() {
        return 2 * getSideA() + 2 * getSideB();
    }

    @Override
    public double getDiagonal() {
        double diagonal;

        diagonal = Math.sqrt(Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2));

        return diagonal;
    }

    public double getSideB() {
        return sideB;
    }
}
