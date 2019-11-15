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
        Rectangle rectangle = new Rectangle(25, 26);
        rectangle.display();
//        Test for getters & setters
        rectangle.setPointLT(10.00);
        rectangle.setPointRU(15.50);
        System.out.printf("PointLT = %.2f, PointRU = %.2f\n", rectangle.getPointLT(), rectangle.getPointRU());
//        Test for methods
        System.out.printf("Area = %.2f, perimetr = %.2f\n", rectangle.area(rectangle), rectangle.perimeter(rectangle));
    }
}


