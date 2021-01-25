package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Rectangle implements TwoDimensionalShapes {
    private static double firstSide;
    private static double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        Rectangle.firstSide = firstSide;
        Rectangle.secondSide = secondSide;
    }

    public static double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        Rectangle.firstSide = firstSide;
    }

    public static double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        Rectangle.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return calculateArea();
    }

    private double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public boolean getEquals() {
        return calculateArea() == getArea();
    }

    public double getPerimeter() {
        return calculatePerimeter();
    }

    private double calculatePerimeter() {
        return 2 * (firstSide + secondSide);
    }

    @Override
    public String toString() {
        return "rectangle area: " + calculateArea() + ", rectangle perimeter: " + calculatePerimeter();
    }
}
