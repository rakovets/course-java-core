package com.rakovets.course.java.core.practice.oop_principles.Geometry;

public interface Figure {

    double getSquare();

    double getPerimeter();

    default boolean isSquareEquals(Figure figure) {
        return getSquare() == figure.getSquare();
    }
}
