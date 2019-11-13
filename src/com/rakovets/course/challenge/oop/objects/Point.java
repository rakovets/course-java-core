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

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    void display() {
        System.out.printf("Point X is %f\n", getX());
        System.out.printf("Point Y is %f\n", getY());
    }

//    public double distance(double a, double b) {
//        double z = Math.sqrt((Math.pow((a - getX()), 2) + Math.pow((b - getY()), 2)));
//        return z;
//    }

    void distance(double a, double b) {
//        double z = Math.sqrt((Math.pow((a - getX()), 2) + Math.pow((b - getY()), 2)));
//        double z = Math.sqrt((Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2)));
        double z = Math.sqrt((Math.pow((a - this.x), 2) + Math.pow((b - this.y), 2)));

        System.out.println(z);
        System.out.printf("a = %f, this.x = %f, b = %f, this.y = %f\n", a, this.x, b, this.y);
    }
}