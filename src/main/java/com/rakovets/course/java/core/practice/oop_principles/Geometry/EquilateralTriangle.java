package com.rakovets.course.java.core.practice.oop_principles.Geometry;

import com.rakovets.course.java.core.util.NumberUtil;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double sideA) {
        super(sideA, sideA, sideA);
    }

    @Override
    public double getPerimeter() {
        return 3 * getSideA();
    }

    @Override
    public double getSquare() {
        return NumberUtil.roundValueToTwoDigitsForMantissa(Math.pow(getSideA(), 2) * Math.sqrt(3) / 4);
    }

    @Override
    public double getHeight() {
        return NumberUtil.roundValueToTwoDigitsForMantissa(getSideA() * Math.sqrt(3) / 2);
    }
}
