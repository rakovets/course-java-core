package com.rakovets.course.java.core.practice.oop_principles.Geometry;

import com.rakovets.course.java.core.util.NumberUtil;

public class Rectangle implements Figure, Diagonal {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getPerimeter() {
        return NumberUtil.roundValueToTwoDigitsForMantissa(2 * (sideA + sideB));
    }

    @Override
    public double getSquare() {
        return NumberUtil.roundValueToTwoDigitsForMantissa(sideA * sideB);
    }

    @Override
    public double getDiagonal() {
        return NumberUtil.roundValueToTwoDigitsForMantissa(Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));
    }

    @Override
    public String toString() {
        return "Rectangle{" + "sideA=" + sideA + ", sideB=" + sideB + '}';
    }
}
