package com.rakovets.course.java.core.practice.oop_classes_and_objects;

/**
 * Создать class Rectangle.
 * Создать Fields:
 * topLeftPoint - первая точка
 * bottomRightPoint – вторая точка
 * Создать Constructors:
 * Rectangle(topLeftPoint, bottomRightPoint) – принимает два объекта типа Point
 * Создать Methods:
 * getTopLeftPoint()
 * setTopLeftPoint()
 * getBottomRightPoint()
 * setBottomRightPoint()
 * getPerimeter() – возвращает периметр прямоугольника
 * getArea() – возвращает площадь прямоугольника
 */
public class Rectangle {
    public Point topLeftPoint;
    public Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = new Point(topLeftPoint);
        this.bottomRightPoint = new Point(bottomRightPoint);
    }

    public Point getTopLeftPoint() {
        return new Point(topLeftPoint);
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = new Point(topLeftPoint);
    }

    public Point getBottomRightPoint() {
        return new Point(bottomRightPoint);
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = new Point(bottomRightPoint);
    }

    public int getPerimeter() {
        return 2 * (Math.abs(topLeftPoint.x - bottomRightPoint.x) + Math.abs(topLeftPoint.y - bottomRightPoint.y));
    }

    public int getArea() {
        return Math.abs(topLeftPoint.x - bottomRightPoint.x) * Math.abs(topLeftPoint.y - bottomRightPoint.y);
    }
}
