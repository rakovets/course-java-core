package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class ShapeUtils {

    static boolean isRectangle(int firstSide, int secondSide, int thirdSide, int fourthSide) {
        if (firstSide == fourthSide && thirdSide == fourthSide && secondSide == fourthSide)
            return true;
        else if (firstSide == secondSide && thirdSide == fourthSide)
            return true;
        else if (firstSide == fourthSide && thirdSide == secondSide)
            return true;
        else return firstSide == thirdSide && fourthSide == secondSide;
    }

    static boolean isTriangle(int firstSide, int secondSide, int thirdSide) {
        return firstSide + secondSide <= thirdSide || firstSide + thirdSide <= secondSide || secondSide + thirdSide <=
                firstSide;
    }
}
