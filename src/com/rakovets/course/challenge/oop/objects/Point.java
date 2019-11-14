package com.rakovets.course.challenge.oop.objects;

/*## Specification of task 3
Создать класс `Point`.

Поля:
- `x` - координата
- `y` - координата

Конструктор:
- `Point(x, y)` – принимает координаты `x` и `y`

Методы:
- `getX()` – получает `x`
- `setX()` – задает `x`
- `getY()` – получает `y`
- `setY()` – задает `y`
- `distance(point)` – принимает `point`, возвращает расстояние от текущей точки (экземпляра, для которого был вызван),
до принимаемой точки
Написать тесты для класса.
*/

class Point {
    private double x;
    private double y;

    Point(double x, double y) {
       this.x = x;
       this.y = y;
    }

    double getX()
    {
        return this.x;
    }

    void setX(double x) {
        this.x = x;
    }

    double getY() {
        return this.y;
    }

    void setY(double y) {
        this.y = y;
    }

    void display() {
        System.out.printf("Point X is %.2f, Point Y is %.2f\n", getX(), getY());
    }

    double distance(Point point) {
        return Math.sqrt((Math.pow((point.x - this.x), 2) + Math.pow((point.y - this.y), 2)));

    }
}