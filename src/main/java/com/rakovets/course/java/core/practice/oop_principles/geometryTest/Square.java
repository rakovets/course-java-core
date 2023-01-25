package com.rakovets.course.java.core.practice.oop_principles.geometryTest;

public class Square extends Figure {
    private final double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    public double area() {
        return Math.pow(getSideA(), 2);
    }

    public double perimeter() {
        return 4 * getSideA();
    }

    public double getDiagonal() {
        double diagonal;

        diagonal = Math.sqrt(2) * getSideA();

        return diagonal;
    }

    @Override
    public String toString() {
        return null;
    }

    public double getSideA() {
        return sideA;
    }

}
