package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleApplication {
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(new Point(10,15), new Point(18, 20));
       Point one = new Point(15, 30);
       Point two = new Point(46, 18);

       rectangle.setTopLeftPoint(one);
       rectangle.setBottomRightPoint(two);

       System.out.println("Top-left point is: " + rectangle.getTopLeftPoint());
       System.out.println("Bottom-right point is: " + rectangle.getBottomRightPoint());
       System.out.println("Perimeter is: " + rectangle.getPerimeter());
       System.out.println("Area is: " + rectangle.getArea());
    }
}
