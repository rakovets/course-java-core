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




class Interval {
   private int hours;
   private int minutes;
   private int seconds;

//    public int getSeconds(int hours, int minutes, int seconds) {
//
//    }

    Interval(int AllSeconds) {
        this.hours = AllSeconds / 3600;
        this.minutes = (AllSeconds - (this.hours * 3600)) / 60;
        this.seconds = AllSeconds - (this.hours * 3600 + this.minutes * 60);
    }

    Interval(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    Видео на 18-й минуте!!!

    void display() {
        System.out.printf("H: %d, M: %d, S: %d\n", this.hours, this.minutes, this.seconds);
//        System.out.printf("Point Y is %f\n", getY());
    }
}




