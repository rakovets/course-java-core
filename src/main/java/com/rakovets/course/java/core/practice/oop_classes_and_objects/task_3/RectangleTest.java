package com.rakovets.course.java.core.practice.oop_classes_and_objects.task_3;
import com.rakovets.course.java.core.practice.oop_classes_and_objects.task_2.*;
public class RectangleTest {
    public static void main(String[] args) {
        Point pointOne = new Point(40, 50);
        Point pointTwo = new Point(20, 60);
        Rectangle rectangleOne = new Rectangle(pointOne, pointTwo);
        rectangleOne.getBottomRightPoint();
        rectangleOne.getTopLeftPoint();
        rectangleOne.getPerimeter();
        rectangleOne.getArea();

        Point pointThree = new Point(500, 700);
        Point pointFour = new Point(400, 900);
        rectangleOne.setBottomRightPoint(pointThree);
        rectangleOne.setTopLeftPoint(pointFour);


    }
}
