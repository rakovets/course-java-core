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
    public int topLeftPoint;
    public int bottomRightPoint;

    public Rectangle(int topLeftPoint, int bottomRightPoint) {
        Point point = new Point(topLeftPoint, bottomRightPoint);
        this.topLeftPoint = point.x;
        this.bottomRightPoint = point.y;
    }

    public int getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint(int topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public int getBottomRightPoint() {
        return bottomRightPoint;
    }

    public void setBottomRightPoint(int bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }

    public int getPerimeter() {
        return (topLeftPoint + bottomRightPoint) * 2;
    }

    public int getArea() {
        return topLeftPoint * bottomRightPoint;
    }
}
