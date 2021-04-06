package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Rectangle {
    private double firstPoint;
    private double secondPoint;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getDistance(Point point) {
        double distancePoints;
        distancePoints =
        return distancePoints;
    }
}
== Specification of task 3

        1. Создать class `Rectangle`.

        2. Создать *Fields*:

        * `firstPoint` - первая точка
        * `secondPoint` – вторая точка

        3. Создать *Constructors*:

        * `Rectangle(firstPoint, secondPoint)` – принимает два объекта типа `Point`

        4. Создать *Methods*:

        * `getFirstPoint()`
        * `setFirstPoint()`
        * `getSecondPoint()`
        * `setSecondPoint()`
        * `getPerimeter()` – возвращает периметр прямоугольника
        * `getArea()` – возвращает площадь прямоугольника
