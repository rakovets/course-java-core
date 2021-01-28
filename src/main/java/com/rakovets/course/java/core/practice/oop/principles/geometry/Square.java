package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Square implements TwoDimensionalShapes {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
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
