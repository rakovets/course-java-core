package com.rakovets.course.java.core.practice.oop_principles.Geometry;

import com.rakovets.course.java.core.util.NumberUtil;

public class Circle extends Ellipse {

    public Circle(double radiusA) {
        super(radiusA, radiusA);
    }

    @Override
    public double getPerimeter() {
        return NumberUtil.roundValueToTwoDigitsForMantissa(2 * getRadiusA() * Math.PI);
    }

    @Override
    public double getSquare() {
        return NumberUtil.roundValueToTwoDigitsForMantissa(Math.PI * Math.pow(getRadiusA(), 2));
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + getRadiusA() + '}';
    }
}
