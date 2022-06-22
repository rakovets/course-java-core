package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleApplication {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(new Point(16,22), new Point(14, 23));
            Point one = new Point(33, 55);
            Point two = new Point(27, 72);

            rectangle.setTopLeftPoint(one);
            rectangle.setBottomRightPoint(two);

            Point topLeft = rectangle.getTopLeftPoint();
            Point botomRight = rectangle.getBottomRightPoint();

            System.out.println("Top-left point is: x= " + topLeft.getX() + " " + "y=" + topLeft.getY());
            System.out.println("Bottom-right point is: y=" + botomRight.getY() + " " + "x=" + botomRight.getX());
            System.out.println("Perimeter is: " + rectangle.getPerimeter());
            System.out.println("Area is: " + rectangle.getArea());
        }
    }
