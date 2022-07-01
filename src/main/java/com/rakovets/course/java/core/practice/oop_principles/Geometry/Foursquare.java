package com.rakovets.course.java.core.practice.oop_principles.Geometry;

import com.rakovets.course.java.core.util.NumberUtil;

public class Foursquare extends Rectangle {
    public Foursquare(double sideA) {
        super(sideA, sideA);
    }

    @Override
    public double getDiagonal() {
        return NumberUtil.roundValueToTwoDigitsForMantissa(Math.sqrt(2) * getSideA());
    }
}
