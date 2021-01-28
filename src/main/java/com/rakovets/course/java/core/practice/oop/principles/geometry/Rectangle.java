package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Rectangle implements TwoDimensionalShapes {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return this.firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return this.secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
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
