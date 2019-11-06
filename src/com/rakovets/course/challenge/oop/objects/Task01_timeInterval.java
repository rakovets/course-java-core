package com.rakovets.course.challenge.oop.objects;

/**## Specification of task 1
 Создать класс, описывающий промежуток времени. Сам промежуток времени должен задаваться тремя свойствами:
 - секундами
 - минутами
 - часами

 Создать метод для получения полного количества секунд в объекте Создать два конструктора: первый принимает общее
 количество секунд, второй - часы, минуты и секунды по отдельности. Создать метод для вывода данных. 

 Написать тесты для класса.
 */


public class Task01_timeInterval {
    public static void main(String[] args) {
//        Interval timeInterval = new Interval(); // создание объекта
//        timeInterval.displayInfo();

    }
}

class Interval {
    int hours;
    int minutes;
    int seconds;

    Interval (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}



