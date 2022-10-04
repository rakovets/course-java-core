package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.util.NumberUtil;

/**
 * Создать class Point, описывающей точку в декартовой системе координат.
 * Создать Fields:
 * x - координата точки по оси Ox
 * y - координата точки по оси Oy
 * Создать Constructors:
 * Point(x, y) – принимает координаты x и y
 * Создать Methods:
 * getX()
 * setX()
 * getY()
 * setY()
 * getDistance(point) – принимает объект типа Point,
 * возвращает расстояние от текущей точки (экземпляра, для которого был вызван), до принимаемой точки
 * Note
 * Для каждого созданного класса, нужно создать демонстрационные/тестовые классы,
 * которые демонстрируют/тестирую работу ВСЕХ конструкторов и методов.
 * Warning
 * ТОЛЬКО демонстрационные классы могут содержать вывод в Standard Output (консольный вывод).
 */

public class Point {
    public int x;
    public int y;

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point point) {
        int xNew = this.x - point.x;
        int yNew = this.y - point.y;
        return NumberUtil.roundValueToTwoDigitsForMantissa(Math.pow((Math.pow(xNew, 2) + Math.pow(yNew, 2)), 0.5));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
