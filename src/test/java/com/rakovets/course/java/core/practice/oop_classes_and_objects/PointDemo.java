package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Test;

public class PointDemo {
    @Test
    public static void main (String[]   args){
        Point pointFirst = new Point(3, 5);
        Point pointTwo = new Point(8, 1);
        System.out.println();
        System.out.println("Length line " + pointFirst.getDistance(pointTwo));

    }
}
