package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Rhombus extends Quadrangle implements Height {
    private double side;
    private int angle;
    public Rhombus(double side, int angle) {
        super("Rhombus");
        this.side = side;
        this.angle = angle;
    }

    @Override
    public double findArea() {
        return Math.pow(side, 2) * Math.sin(angle);
    }

    @Override
    public double[] findDiagonal() {
        return new double[] { Math.sqrt(2 * Math.pow(side, 2)) * (1 - Math.cos(angle)),
                Math.sqrt(2 * Math.pow(side, 2)) * (1 - Math.cos(180 - angle)) };
    }

    @Override
    public double findHeight() {
        return findArea() / side;
    }

    @Override
    public double findPerimeter(int side) {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "side= " + side +
                ", angle= " + angle +
                '}';
    }
}
