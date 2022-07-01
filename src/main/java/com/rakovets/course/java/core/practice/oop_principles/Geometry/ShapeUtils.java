package com.rakovets.course.java.core.practice.oop_principles.Geometry;

public class ShapeUtils {

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle;
    }

    public static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }
}
