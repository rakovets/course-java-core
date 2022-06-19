package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleApplication {
    public static void main(String[] args) {
        Point left = new Point(1, 1);
        Point right = new Point(2, 2);
        Rectangle figure = new Rectangle(left, right);
        System.out.println("Points of rectangle are " + figure.getTopLeftPoint().getX() + ", " + figure.getTopLeftPoint().getY()
                + "; " + figure.getBottomRightPoint().getX() + ", " + figure.getBottomRightPoint().getY());
        figure.setTopLeftPoint(new Point(6, 6));
        figure.setBottomRightPoint(new Point(5, 5));
        System.out.println("Points of rectangle are " + figure.getTopLeftPoint().getX() + ", " + figure.getTopLeftPoint().getY()
                + "; " + figure.getBottomRightPoint().getX() + ", " + figure.getBottomRightPoint().getY());
        System.out.println("Perimeter is " + figure.getPerimeter());
        System.out.println("Area is " + figure.getArea());
    }
}
