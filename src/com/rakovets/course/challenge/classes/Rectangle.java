package com.rakovets.course.challenge.classes;

public class Rectangle {
    double x1;
    double y1;
    double x2;
    double y2;
    Point firstPoint = new Point(x1, y1);
    Point secondPoint = new Point(x2, y2);

    Rectangle(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    /*
    как правильно написать getter который должен взвращать два значения?
    может массив?
    или итак сойдет?
     */
    /*
    еще один вопрос. почему при попытки извлечения значения Х у точки посредством использования firstPoint.X, выдает (0, 0)б а firstPoint.getX, все хорошо?
     */
    void getFirstPoint() {
        System.out.println("first point coordinates are: (" + firstPoint.getX() + ", " + firstPoint.getY() + ")");
    }

    void getSecondPoint() {
        System.out.println("second point coordinates are: (" + secondPoint.getX() + ", " + secondPoint.getY() + ")");
    }

    void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    double getPerimeter() {
        return (Math.abs(2 * ((secondPoint.getX() - firstPoint.getX()) + (secondPoint.getY() - firstPoint.getY()))));
    }

    double getArea() {
        return (Math.abs(((secondPoint.getX() - firstPoint.getX())*(secondPoint.getY() - firstPoint.getY()))));
    }
}
