package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleApplication {
    public static void main(String[] args) {
        Point left = new Point(10, 10);
        Point right = new Point(5, 5);
        Rectangle figure = new Rectangle(left, right);
        System.out.println("Point left : " + "x= " + figure.getTopLeftPoint().getX()  + " ;  " + "y= "+ figure.getTopLeftPoint().getY());
        System.out.println("Point right : " + "x= " + figure.getBottomRightPoint().getX()  + " ;  " + "y= "+ figure.getBottomRightPoint().getY());
        figure.setTopLeftPoint(new Point(8, 4));
        figure.setBottomRightPoint(new Point(6, 1));
        System.out.println("Point left : " + "x= " + figure.getTopLeftPoint().getX()  + " ;  " + "y= "+ figure.getTopLeftPoint().getY());
        System.out.println("Point right : " + "x= " + figure.getBottomRightPoint().getX()  + " ;  " + "y= "+ figure.getBottomRightPoint().getY());
        System.out.println("Perimeter : " + figure.getPerimeter());
        System.out.println("Area : " + figure.getArea());
    }
}

