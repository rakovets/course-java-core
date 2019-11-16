package com.rakovets.course.challenge.oop.objects;

/*## Specification of task 4
Создать класс `Rectangle`.

Поля:
- `pointLT` - точка левого верхнего угла
- `pointRU` – точка правого нижнего угла

Конструктор:
- `Rectangle(point1, point2)` – принимает два `Point`

Методы:
- `getPointLT()` – получает точку левого верхнего угла
- `setPointLT()` – задает точку левого верхнего угла
- `getPointRU()` – получает точку правого нижнего угла
- `setPointRU()` – задает точку правого нижнего угла
- `area()` – возвращает площадь прямоугольника
- `perimeter()` – возвращает периметр прямоугольника

Написать тесты для класса.
*/
public class TestRectangle {
    public static void main(String[] args) {
//        Test for constructor
        Point pointLT = new Point(-4, 23);
        Point pointRU = new Point(10, -15);
        Rectangle rectangle = new Rectangle(pointLT, pointRU);
        rectangle.display();
//        Test for getters & setters
        rectangle.getPointLT().display();
        rectangle.getPointRU().display();
        Point i = new Point(-1.0, 1);
        rectangle.setPointLT(i);
        Point j = new Point(5, -5);
        rectangle.setPointRU(j);
        rectangle.display();
//        Test for methods
        System.out.printf("Area = %.2f, perimetr = %.2f\n", rectangle.area(), rectangle.perimeter());
    }
}

