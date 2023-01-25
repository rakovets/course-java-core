package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class Triangle extends IsoscelesTriangle {
    private final double sideC;
    private final double angleA;

    public Triangle(double sideA, double sideB, double angleA) {
        super(sideA, sideB);
        this.angleA = angleA;
        this.sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB
                * Math.cos(Math.toRadians(angleA)));
    }

    @Override
    public double area() {
        double result;

        result = getSideA() * getSideB() * Math.sin(Math.toRadians(angleA)) / 2;

        return result;
    }

    @Override
    public String toString() {
        return "Info";
    }

    public double getSideC() {
        return sideC;
    }
}
