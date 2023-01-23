package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class Rectangle extends Square {
    private final double SIDE_B;

    public Rectangle(double sideA, double sideB) {
        super(sideA);
        this.SIDE_B = sideB;
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
        return SIDE_B;
    }
}
