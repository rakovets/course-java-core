package com.rakovets.course.challenge.oop.objects;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
//        Tests for constructor
        Point point = new Point(1.0, 1.1);
        System.out.println("Координаты нашей точки:");
        point.display();
//        Tests for getters & setters
        System.out.println("Задаём новые координаты для нашей точки. Введите новый X в формате \"double\"");
        point.setX(reader.nextDouble());
        System.out.println("Введите новый Y в формате \"double\"");
        point.setY(reader.nextDouble());
        System.out.println("Какие новые координаты нашей точки?");
        point.display();
//        Tests for dictance(point)
        System.out.println("Создаём новую точку children c параметрами X = 3.0 и Y = 5.0");
        Point children = new Point(3.0, 5.0);
        System.out.println("Координаты точки children:");
        children.display();
        System.out.printf("Расстояние между точками children и point = %.2f\n", children.distance(point));
    }
}
