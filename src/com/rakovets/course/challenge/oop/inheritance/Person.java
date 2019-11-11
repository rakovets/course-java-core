package com.rakovets.course.challenge.oop.inheritance;

/**### Specification of task 3
 Создать класс `Person`.

 Поля:
 - `happiness` количество счастья у человека (в процентах)

 Конструкторы:
 - `Person(happiness)` принимает количество счастья

 Методы:
 - `takeHappiness(happiness)` получение/возвращение счастья (зависит от того какое число: полож./отриц.)
 - `getHappiness()` получить количество счастья
 - `setHappiness(happiness)` задать количество счастья
 */

public class Person {
    private double happiness;

    Person(double happiness) {
        this.happiness = happiness;
    }

    public double takeHappiness(double happiness) {
        this.happiness += happiness;
        return this.happiness;
    }

    public double getHappiness() {
        return this.happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    void displayInfo() {
        System.out.printf("Level of Happines now is %f points now\n", happiness);
    }

}
