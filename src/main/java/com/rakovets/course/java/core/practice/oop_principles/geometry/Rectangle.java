package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class Rectangle extends Square {
    private final double SIDE_B;
    private final double DIAGONAL_B;

    public Rectangle(double sideA, double sideB) {
        super(sideA);
        this.SIDE_B = sideB;
        this.DIAGONAL_B = Math.sqrt(Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2));
    }

    @Override
    public double area() {
        return getSideA() * getSideB();
    }

    @Override
    public double perimeter() {
        return 2 * getSideA() + 2 * getSideB();
    }

    public double getSideB() {
        return SIDE_B;
    }

    @Override
    public double getDiagonalA() {
        return DIAGONAL_B;
    }

}
