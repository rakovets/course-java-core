package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleApplication {
    public static void main(String[] args){
        Point topLeftPoint = new Point(6,2);
        Point bottomRightPoint = new Point(6,8);
        Rectangle rectangle = new Rectangle(topLeftPoint,bottomRightPoint);
        System.out.println("Top left points coordinates: " + "x = " + rectangle.getTopLeftPoint().get_X()  + ";  " + "y = "+ rectangle.getTopLeftPoint().get_Y());
        System.out.println("Right left point coordinates: " + "x = " + rectangle.getBottomRightPoint().get_X()  + "; " + "y = "+ rectangle.getBottomRightPoint().get_Y());
        System.out.println();
        rectangle.setTopLeftPoint(new Point(4,1));
        rectangle.setBottomRightPoint(new Point(4,12));
        System.out.println("Top left points new coordinates: " + "x = " + rectangle.getTopLeftPoint().get_X()  + ";  " + "y = "+ rectangle.getTopLeftPoint().get_Y());
        System.out.println("Right left point new coordinates: " + "x = " + rectangle.getBottomRightPoint().get_X()  + "; " + "y = "+ rectangle.getBottomRightPoint().get_Y());
        System.out.println();
        System.out.println("The area of the rectangle is " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());
    }
}
