package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class Square implements MainUtils {
    private final double SIDE_A;
    private final double DIAGONAL_A;

    public Square(double sideA) {
        this.SIDE_A = sideA;
        this.DIAGONAL_A = Math.sqrt(2) * getSideA();
    }

    public double area() {
        return Math.pow(getSideA(), 2);
    }

    public double perimeter() {
        return 4 * getSideA();
    }

    public double getDiagonalA() {
        return DIAGONAL_A;
    }

    public double getSideA() {
        return SIDE_A;
    }
}
