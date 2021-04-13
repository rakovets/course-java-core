package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class ShapeUtils {
    public static boolean isRectangle(Figure figure) {
        return figure.getName().equalsIgnoreCase("Rectangle");
    }

    public static boolean isTriangle(Figure figure) {
        return figure.getName().equalsIgnoreCase("Triangle");
    }
}
