package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Rhombus implements TwoDimensionalShapes {
    private static double firstDiagonal;
    private static double secondDiagonal;

    public Rhombus(double firstDiagonal, double secondDiagonal) {
        Rhombus.firstDiagonal = firstDiagonal;
        Rhombus.secondDiagonal = secondDiagonal;
    }

    public static double getFirstDiagonal() {
        return firstDiagonal;
    }

    public void setFirstDiagonal(double firstDiagonal) {
        Rhombus.firstDiagonal = firstDiagonal;
    }

    public static double getSecondDiagonal() {
        return secondDiagonal;
    }

    public void setSecondDiagonal(double secondDiagonal) {
        Rhombus.secondDiagonal = secondDiagonal;
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
