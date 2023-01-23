package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class Square {
    private final double SIDE_A;
    private final double DIAGONAL_A;

    public Square(int sideA) {
        this.SIDE_A = sideA;
        this.DIAGONAL_A = Math.sqrt(2) * getSideA();
    }

    public double area() {
        return Math.pow(getSideA(), 2);
    }

    public double perimeter() {
        return 4 * getSideA();
    }

    public double getSideA() {
        return SIDE_A;
    }

    public double getDiagonalB() {
        return DIAGONAL_A;
    }
}
