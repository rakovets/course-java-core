package com.rakovets.course.challenge.OOP.classesAndObject;

public class PointTests {
    public static void main(String[] args) {
        Point point = new Point(10, 10);
        Point newPoint = new Point();
        newPoint.setX();
        newPoint.setY();
        System.out.println("Координаты объекта point: " + point.getX() + ", " + point.getY());
        System.out.println("Координаты объекта newPoint: " + newPoint.getX() + ", " + newPoint.getY());
        System.out.printf("Расстояние между объектами point и newPoint: %s\n\n", newPoint.distance(point));

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setFirstPoint();
        rectangle1.setSecondPoint();
        System.out.println("Периметр прямоугольника1: " + rectangle1.getPerimeter());
        System.out.printf("Площадь прямоугольника1: %s\n\n", rectangle1.getArea());


        Rectangle rectangle2 = new Rectangle(new Point(15, 12), new Point(24, 17));
        System.out.println("Координаты объекта rectangle2:");
        System.out.println("point2: " + rectangle2.getSecondPoint().x + ", " + rectangle2.getSecondPoint().y +
                ";  point1: " + rectangle2.getFirstPoint().x + ", " + rectangle2.getFirstPoint().y);
        System.out.println("Периметр прямоугольника2: " + rectangle2.getPerimeter());
        System.out.println("Площадь прямоугольника2: " + rectangle2.getArea());
    }
}
