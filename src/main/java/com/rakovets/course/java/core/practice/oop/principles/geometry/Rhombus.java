package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Rhombus implements TwoDimensionalShapes {
    private double firstDiagonal;
    private double secondDiagonal;

    public Rhombus(double firstDiagonal, double secondDiagonal) {
        this.firstDiagonal = firstDiagonal;
        this.secondDiagonal = secondDiagonal;
    }

    public double getFirstDiagonal() {
        return this.firstDiagonal;
    }

    public void setFirstDiagonal(double firstDiagonal) {
        this.firstDiagonal = firstDiagonal;
    }

    public double getSecondDiagonal() {
        return this.secondDiagonal;
    }

    public void setSecondDiagonal(double secondDiagonal) {
        this.secondDiagonal = secondDiagonal;
    }

    @Override
    public double getArea() {
        return calculateArea();
    }

    @Override
    public boolean getEquals() {
        return calculateArea() == getArea();
    }

    private double calculateArea() {
        return firstDiagonal * secondDiagonal / 2;
    }

    @Override
    public String toString() {
        return "rhombus area: " + calculateArea();
    }
}
