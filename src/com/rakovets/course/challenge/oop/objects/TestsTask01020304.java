package com.rakovets.course.challenge.oop.objects;
import java.util.Scanner;

public class TestsTask01020304{
    public static void main(String[] args) {
        Point point = new Point(45.5, 32.25);
        System.out.println("Координаты нашей точки:");
        point.display();
        Scanner reader = new Scanner(System.in);
//        System.out.println("Задаём новые координаты для нашей точки. Введите новый X в формате \"double\"");
////        double newX = reader.nextDouble();
//        point.setX(reader.nextDouble());
//        System.out.println("Введите новый Y в формате \"double\"");
//        point.setY(reader.nextDouble());
//        System.out.println("Какие новые координаты нашей точки?");
//        point.display();
        System.out.println("Создаём новую точку children c параметрами X = 17.2 и Y = 14.4");
        Point children = new Point(17.2, 14.4);
        System.out.println("Координаты точки children:");
        children.display();
        point.display();
        System.out.println("Расстояние между точками children и point = ");
//        double i = children.getX();
//        double j = children.getY();
//
//        System.out.printf("i = %f, j = %f", i, j);
//
//        children.distance(i, j);
//        children.distance(children.getX(), children.getY());
        children.distance(17.2,14.4);
    }
}
