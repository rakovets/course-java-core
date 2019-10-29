package com.rakovets.course.challenge;

import java.util.Scanner;

/**## Specification of task 1
 Создать класс, описывающий промежуток времени. Сам промежуток времени должен задаваться тремя свойствами:
 - секундами
 - минутами
 - часами

 Создать метод для получения полного количества секунд в объекте Создать два конструктора: первый принимает общее
 количество секунд, второй - часы, минуты и секунды по отдельности. Создать метод для вывода данных. 

 Написать тесты для класса.
 */


public class Task01_Clocks {
    public static void main(String[] args) {
        Clocks whatTime = new Clocks(); // создание объекта
        whatTime.displayInfo();

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Your text: ");
        String str = reader.nextLine();

        tom.name = "Tom"; // изменение имени
        tom.age = 34; // изменение возраста
        tom.displayInfo();
    }
}

class Clocks {
    int seconds;
    int minutes;
    int hours;

    void displayInfo() {
        System.out.printf("Time: %d hours, %d minutes, %d seconds", hours, minutes, seconds);
    }
}


//public class Task01 {
//    public static void main(String[] args) {
//        Clocks tom;
//    }
//}
//
//class Clocks {
//    int seconds;
//    int minutes;
//    int hours;
//
//    void displayInfo() {
//        System.out.printf("Time: %s \tAge: %d\n", name, age);
//    }
//}
