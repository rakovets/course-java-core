package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleApplication {
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(new Point(10,15), new Point(18, 20));
       rectangle.setTopLeftPoint(0,10);
       rectangle.setBottomRightPoint(10, 0);
       System.out.println("Top-left point is: " + rectangle.getTopLeftPoint());
       System.out.println("Bottom-right point is: " + rectangle.getBottomRightPoint());
       System.out.println("Perimeter is: " + rectangle.getPerimeter());
       System.out.println("Area is: " + rectangle.getArea());
    }
}
