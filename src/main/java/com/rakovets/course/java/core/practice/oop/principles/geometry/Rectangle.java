package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Rectangle extends Quadrangle {
    private double leftSide, topSide;
    public Rectangle(double leftSide, double topSide) {
        super("Rectangle");
        this.leftSide = leftSide;
        this.topSide = topSide;
    }

    @Override
    public double[] findDiagonal() {
        return new double[] { Math.sqrt(Math.pow(leftSide, 2) + Math.pow(topSide, 2)) };
    }

    @Override
    public double findArea() {
        return leftSide * topSide;
    }

    @Override
    public double findPerimeter(int side) {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftSide = " + leftSide +
                ", topSide = " + topSide +
                '}';
    }
}
