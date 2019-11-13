package com.rakovets.course.challenge.oop.Geometry;

public class ShapeUtils {
    public static boolean isRectangle(Figure figure) {
        System.out.println(figure.getClass().getSimpleName());
        if (figure.getClass().getSimpleName().equals("Rectangle")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTriangle(Figure figure) {
        System.out.println(figure.getClass().getSimpleName());
        if (figure.getClass().getSimpleName().equals("Triangle")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isCircle(Circle figure) {
        System.out.println(figure.getClass().getSimpleName());
        if (figure.getClass().getSimpleName().equals("Circles")) {
            return true;
        } else {
            return false;
        }
    }
}
