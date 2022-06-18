package com.rakovets.course.java.core.practice.oop_classes_and_objects;

/**
 * @author Anastasia Melnikova
 * @since 18.06.2022
 */
public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    /**
     * Конструктор. Принимает два объекта типа `Point`
     *
     * @param topLeftPoint     первая точка
     * @param bottomRightPoint вторая точка
     */
    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    /**
     * Метод для получения значения поля
     */
    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    /**
     * Метод для установки значения поля
     */
    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    /**
     * Метод для получения значения поля
     */
    public Point getBottomRightPoint() {
        return bottomRightPoint;
    }

    /**
     * Метод для установки значения поля
     */
    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }

    /**
     * Возвращает периметр прямоугольника
     */
    public int getPerimeter() {
        return 2 * (Math.abs(bottomRightPoint.getX() - topLeftPoint.getX())
                + Math.abs(bottomRightPoint.getY() - topLeftPoint.getY()));
    }

    /**
     * Возвращает площадь прямоугольника
     */
    public int getArea() {
        return Math.abs(bottomRightPoint.getX() - topLeftPoint.getX())
                * Math.abs(bottomRightPoint.getY() - topLeftPoint.getY());
    }
}
