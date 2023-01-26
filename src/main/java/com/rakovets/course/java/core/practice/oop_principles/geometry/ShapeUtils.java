package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class ShapeUtils {
    public static boolean isTriangle(Object object) {
        boolean result;

        result = object instanceof Triangle;

        return result;
    }

    public static boolean isRectangle(Object object) {
        boolean result;

        result = object instanceof Rectangle;

        return result;
    }
}
