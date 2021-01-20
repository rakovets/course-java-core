package com.rakovets.course.java.core.practice.oop.classesandobjects.task_3;

import com.rakovets.course.java.core.practice.oop.classesandobjects.task_2.model.Point;
import com.rakovets.course.java.core.practice.oop.classesandobjects.task_3.model.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle i = new Rectangle(new Point(1, 4), new Point(6, 1));
        i.getFirstPoint();
        i.getSecondPoint();
        i.setFirstPoint(new Point(1,2));
        i.setSecondPoint(new Point(6,5));
        i.getFirstPoint();
        i.getSecondPoint();
        System.out.printf("\nPerimetr: %f", i.getPerimetr());
        System.out.printf("\nArea: %f", i.getArea());
    }
}
