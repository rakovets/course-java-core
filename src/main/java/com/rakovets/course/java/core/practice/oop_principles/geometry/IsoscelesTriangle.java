package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class IsoscelesTriangle extends EquilateralTriangle {
    private final double sideB;

    public IsoscelesTriangle(double sideA, double sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return getSideA() * getSideB() / 2;
    }

    @Override
    public double perimeter() {
        double hypotenuse;
        double perimeter;

        hypotenuse = Math.sqrt(Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2));
        perimeter = hypotenuse + getSideA() + getSideB();

        return perimeter;
    }

    public double getSideB() {
        return sideB;
    }
}
