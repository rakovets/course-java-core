package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Square implements TwoDimensionalShapes {
    private static double side;

    public Square(double side) {
        Square.side = side;
    }

    public static double getSide() {
        return side;
    }

    public void setSide(double side) {
        Square.side = side;
    }

    @Override
    public double getArea() {
        return calculateArea();
    }

    private double calculateArea() {
        return side * side;
    }

    @Override
    public boolean getEquals() {
        return calculateArea() == getArea();
    }

    public double getDiagonal() {
        return calculateDiagonal();
    }

    private double calculateDiagonal() {
        return Math.round(((Math.sqrt(2) * side) * 10) / 10);
    }

    @Override
    public String toString() {
        return "square side: " + side + ", area: " + calculateArea();
    }
}
