package com.rakovets.course.java.core.practice.oop_principles.Geometry;

import com.rakovets.course.java.core.util.NumberUtil;

public class Ellipse implements Figure {
    private final double radiusA;
    private final double radiusB;

    public Ellipse(double radiusA, double radiusB) {
        this.radiusA = radiusA;
        this.radiusB = radiusB;
    }

    public double getRadiusA() {
        return radiusA;
    }

    public double getRadiusB() {
        return radiusB;
    }

    @Override
    public double getPerimeter() {
        return NumberUtil.roundValueToTwoDigitsForMantissa(4 * (Math.PI * radiusA * radiusB +
                Math.abs(radiusA - radiusB)) / (radiusB + radiusA));
    }

    @Override
    public double getSquare() {
        return NumberUtil.roundValueToTwoDigitsForMantissa(radiusA * radiusB * Math.PI);
    }

    @Override
    public String toString() {
        return "Ellipse{" + "radiusA=" + radiusA + ", radiusB=" + radiusB + '}';
    }
}
