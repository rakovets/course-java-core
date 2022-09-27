package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        System.out.println("**Samples of getters, setters and \"getPerimeter\" / \"getArea\" methods**\n");
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println("TopLeftPoint: " + rectangle.getTopLeftPoint());
        System.out.println("BottomRightPoint: " + rectangle.getBottomRightPoint());
        System.out.println("Initial perimeter: " + rectangle.getPerimeter());
        System.out.println("Initial area: " + rectangle.getArea());
        System.out.println("-----");
        rectangle.setTopLeftPoint(5);
        rectangle.setBottomRightPoint(7);
        System.out.println("Changed TopLeftPoint: " + rectangle.getTopLeftPoint());
        System.out.println("Changed BottomRightPoint: " + rectangle.getBottomRightPoint());
        System.out.println("Changed perimeter: " + rectangle.getPerimeter());
        System.out.println("Changed area: " + rectangle.getArea());
    }
}
