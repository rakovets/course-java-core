package com.rakovets.course.java.core.practice.oop_principles.geometry;

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
