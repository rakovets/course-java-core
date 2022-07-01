package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleApplication {
    public static void main(String[] args) {
        Point topLeftPoint = new Point(5, 25);
        Point bottomRightPoint = new Point(33, -2);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);

        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("topLeftPoint: x " + rectangle.getTopLeftPoint().getX() + "; y " + rectangle.getTopLeftPoint().getY());
        System.out.println("bottomRightPoint: x " + rectangle.getBottomRightPoint().getX() + "; y " + rectangle.getBottomRightPoint().getY());

        Point newTopLeftPoint = new Point(-8.88, 55.932);
        rectangle.setTopLeftPoint(newTopLeftPoint);
        System.out.println("newTopLeftPoint: x " + rectangle.getTopLeftPoint().getX() + "; y " + rectangle.getTopLeftPoint().getY());

        Point newBottomRightPoint = new Point(45.5, -9.2);
        rectangle.setBottomRightPoint(newBottomRightPoint);
        System.out.println("newBottomRightPoint: x " + rectangle.getBottomRightPoint().getX() + "; y " + rectangle.getBottomRightPoint().getY());

        System.out.println("The perimeter of the new rectangle: " + rectangle.getPerimeter());
        System.out.println("The area of the new rectangle: " + rectangle.getArea());
    }
}
