package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Square extends Quadrangle{
    private double side;
    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double findArea() {
        return side;
    }

    @Override
    public double[] findDiagonal() {
        return new double[] { Math.sqrt(2 * Math.pow(side, 2)) };
    }

    @Override
    public double findPerimeter(int side) {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
