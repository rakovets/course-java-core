package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleApplication {
    public static void main(String[] args) {
        Point topLeftPoint = new Point(2,4);
        Point bottomRightPoint = new Point(5,8);

        Rectangle newRectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        System.out.println("Top left point = " + newRectangle.getTopLeftPoint() +"\n"
                + "Bottom right point" + newRectangle.getBottomRightPoint());
        System.out.println("Top left point = " + newRectangle.setTopLeftPoint(topLeftPoint) +"\n"
        + "Bottom right point" + newRectangle.setBottomRightPoint(bottomRightPoint));
        System.out.println("Perimeter is: " + newRectangle.getPerimeter());
        System.out.println("Area is: " + newRectangle.getArea());
    }
}
