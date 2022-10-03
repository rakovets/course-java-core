package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(1, 2), new Point(3, 4));
        System.out.println("Point of rectangular :" + rectangle.getTopLeftPoint().getX() + " , " + rectangle.getTopLeftPoint().getY() + " and " + rectangle.getBottomRightPoint().getX() + " , " + rectangle.getBottomRightPoint().getY());
        Point left = new Point(7, 8);
        Point right = new Point(7, 1);
        rectangle.setTopLeftPoint(left);
        rectangle.setBottomRightPoint(right);
        System.out.println("Point of rectangular :" + rectangle.getTopLeftPoint().getX() + " , " + rectangle.getTopLeftPoint().getY() + " and " + rectangle.getBottomRightPoint().getX() + " , " + rectangle.getBottomRightPoint().getY());
        System.out.println("Perimeter is " + rectangle.getPerimeter());
        System.out.println("Area is " + rectangle.getArea());
    }
}
