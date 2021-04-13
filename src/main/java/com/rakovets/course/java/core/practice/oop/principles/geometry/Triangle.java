package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Triangle extends Figure implements Height {
    private double leftSide, rightSide, base;
    public Triangle(double leftSide, double rightSide, double base) {
        super("Triangle");
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.base = base;
    }

    @Override
    public double findArea() {
        double p = (leftSide + rightSide + base) / 2;
        return Math.sqrt(p * (p - leftSide) * (p - rightSide) * (p - base));
    }

    @Override
    public double findHeight() {
        return 2 * findArea() / base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "leftSide= " + leftSide +
                ", rightSide= " + rightSide +
                ", base= " + base +
                '}';
    }

    public double getLeftSide() {
        return leftSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    public double getBase() {
        return base;
    }
}
