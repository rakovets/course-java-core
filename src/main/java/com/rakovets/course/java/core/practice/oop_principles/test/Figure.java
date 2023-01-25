package com.rakovets.course.java.core.practice.oop_principles.test;

public abstract class Figure implements MainUtils {
    @Override
    public abstract String toString();

    @Override
    public boolean isAreaEquals(Figure figure) {
        boolean result;

        result = this.area() == figure.area();

        return result;
    }
}
