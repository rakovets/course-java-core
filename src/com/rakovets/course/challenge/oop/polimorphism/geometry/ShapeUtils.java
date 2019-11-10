package com.rakovets.course.challenge.oop.polimorphism.geometry;

interface ShapeUtils {
    default void checkOnShape(Figure a) {
        double sumOfSide1 = a.x + a.y + a.z;
        double sumOfSide2 = a.x + a.y + a.z + a.m;
        if (sumOfSide1 < sumOfSide2) {
            System.out.println("This is rectangle.");
        } else {
            System.out.println("This is triangle.");
        }
    }
}
