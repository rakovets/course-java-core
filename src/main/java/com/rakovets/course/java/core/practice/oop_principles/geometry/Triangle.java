package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class Triangle extends Figure implements Height, Perimeter {
    private final double sideA;

    private final double sideB;

    private final double sideC;

    private final int angleAlfa;

    public Triangle(double sideA, double sideB, int angleAlfa) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB
                * Math.cos(Math.toRadians(angleAlfa)));
        this.angleAlfa = angleAlfa;
    }

    @Override
    public String toString() {
        String result;

        result = "This is Rectangle with next parameters:\nSide A: " + this.getSideA() + "\nSide B: " +
                getSideB() + "\nPerimeter: " + this.perimeter() + "\nArea: " + this.area() + "\nHeight: " +
                this.height();

        return result;
    }

    @Override
    public double area() {
        double result;

        result = getSideA() * getSideB() * Math.sin(Math.toRadians(getAngleAlfa()));

        return result;
    }

    @Override
    public double perimeter() {
        double result;

        result = getSideA() + getSideB() + getSideC();

        return result;
    }

    @Override
    public double height() {
        return 0;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public int getAngleAlfa() {
        return angleAlfa;
    }
}
