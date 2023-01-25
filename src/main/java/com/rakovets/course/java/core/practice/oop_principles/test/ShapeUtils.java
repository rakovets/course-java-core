package com.rakovets.course.java.core.practice.oop_principles.test;

import com.rakovets.course.java.core.practice.oop_principles.geometryTest.EquilateralTriangle;
import com.rakovets.course.java.core.practice.oop_principles.geometryTest.Rectangle;
import com.rakovets.course.java.core.practice.oop_principles.geometryTest.Square;

public class ShapeUtils {
    public static boolean isTriangle(Object object) {
        boolean result;

        result = object instanceof EquilateralTriangle;

        return result;
    }

    public static boolean isQuadrilateral(Object object) {
        boolean result;

        result = object.getClass() == Rectangle.class || object.getClass() == Square.class;

        return result;
    }
}
