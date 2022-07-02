package com.rakovets.course.java.core.practice.oop_principles.Geometry;

import com.rakovets.course.java.core.util.NumberUtil;

public class Triangle implements Figure, Height {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (!(sideA < (sideB + sideC) && sideA > (sideB - sideC)) || !(sideB < (sideA + sideC) && sideB > (sideA - sideC))
                || !(sideC < (sideA + sideB) && sideC > (sideA - sideB))) {
            throw new RuntimeException("It's impossible to create Triangle with These parameters!!!");
        } else {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getSquare() {
        return NumberUtil.roundValueToTwoDigitsForMantissa(0.5 * getHeight() * sideC);
    }

    public double getHeight() {
        double semiPerimeter = getPerimeter() / 2;
        return NumberUtil.roundValueToTwoDigitsForMantissa((2 * Math.sqrt(semiPerimeter * (semiPerimeter - sideA)
                * (semiPerimeter - sideB) * (semiPerimeter - sideC)) / sideC));
    }
}
