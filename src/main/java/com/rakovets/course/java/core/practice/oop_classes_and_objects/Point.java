package com.rakovets.course.java.core.practice.oop_classes_and_objects;

/**
 * @author Anastasia Melnikova
 * @since 18.06.2022
 */
public class Point {
    private int x;
    private int y;

    /**
     * Конструктор. Принимает координаты `x` и `y`
     *
     * @param x координата точки по оси Ox
     * @param y координата точки по оси Oy
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Метод для получения значения поля
     */
    public int getX() {
        return x;
    }

    /**
     * Метод для установки значения поля
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Метод для получения значения поля
     */
    public int getY() {
        return y;
    }

    /**
     * Метод для установки значения поля
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Принимает объект типа `Point`.
     * Возвращает расстояние от текущей точки (экземпляра, для которого был вызван), до принимаемой точки
     *
     * @param instancePoint экземпляр
     */
    public int getDistance(Point instancePoint) {
        return (int) Math.sqrt((this.x - instancePoint.x) * (this.x - instancePoint.x) + (this.y - instancePoint.y) * (this.y - instancePoint.y));
    }
}
