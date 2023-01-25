package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class Triangle extends Figure implements Height, Perimeter {
    private final double sideA;

    private final double sideB;

    private final int angleAlfa;

    public Triangle(double sideA, double sideB, int angleAlfa) {
        this.sideA = sideA;
        this.sideB = sideB;
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
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public boolean isAreaEquals(Figure figure) {
        return true;
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

    public int getAngleAlfa() {
        return angleAlfa;
    }
}
