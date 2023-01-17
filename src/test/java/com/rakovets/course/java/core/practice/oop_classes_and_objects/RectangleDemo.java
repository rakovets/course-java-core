package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Test;

public class RectangleDemo {
    @Test
    public static void main(String[]  args) {
        Point pointFirst = new Point(3, 5);
        Point pointTwo = new Point(8, 1);
        Rectangle rectangle = new Rectangle(pointFirst, pointTwo);
        rectangle.rectanglePerimetr();
        rectangle.rectangleSqure();
    }
}
