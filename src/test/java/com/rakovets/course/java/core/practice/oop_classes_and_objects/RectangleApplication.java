package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleApplication {
    public static void main(String[] args) {
        Point topLeftPoint = new Point(10, 20);
        Point bottomRightPoint = new Point(5, 10);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);

        System.out.println("This perimeter: " + rectangle.getPerimeter());
        System.out.println("This area: " + rectangle.getArea());
        System.out.println("This topLeftPoint: " + rectangle.getTopLeftPoint());
        System.out.println("Coordinates for topLeftPoint: x = " + rectangle.getTopLeftPoint().getX() + ", y = " + rectangle.getTopLeftPoint().getY());
        System.out.println("This bottomRightPoint: " + rectangle.getBottomRightPoint());
        System.out.println("Coordinates for bottomRightPoint: x = " + rectangle.getBottomRightPoint().getX() + ", y = " + rectangle.getBottomRightPoint().getY());

        Point newTopLeftPoint = new Point(100, 200);
        rectangle.setTopLeftPoint(newTopLeftPoint);
        System.out.println("New coordinates for topLeftPoint: x = " + rectangle.getTopLeftPoint().getX() + ", y = " + rectangle.getTopLeftPoint().getY());

        Point newBottomRightPoint = new Point(50, 100);
        rectangle.setBottomRightPoint(newBottomRightPoint);
        System.out.println("New coordinates for bottomRightPoint: x = " + rectangle.getBottomRightPoint().getX() + ", y = " + rectangle.getBottomRightPoint().getY());
    }
}
