package com.rakovets.course.java.core.practice.oop_principles.cat_home;

/**
 * Note
 * Для каждого созданного класса, нужно создать тестовые классы,
 * которые тестирую работу ВСЕХ конструкторов и методов.
 * Warning
 * ТОЛЬКО тестовые классы могут содержать вывод в Standard Output (консольный вывод).
 * Note
 * В процессе разработки код постоянно модифицируется (удаляется, добавляется, изменяется).
 * Note
 * При разработке иерархии держать в уме принцип инкапсуляции,
 * выбирать корректные имена классов и методов, пользоваться преимуществами полиморфизма.
 * Note
 * Отдавайте предпочтение интерфейсам, а не абстрактным классам.
 * Project: 'Cat’s home'
 * <p>
 * Specification of task 1
 * Создать класс Cat.
 * Создать Fields:
 * name – кличка кота
 * Создать Constructors:
 * Cat(name)
 * Создать Methods:
 * mew() – кот мяукает (т.е возвращает "текст" мяуканья)
 * purr() – кот мурлычет (т.е возвращает "текст" мурчания)
 * getName() – получить кличку кота
 * setName(name) – задать кличку кота
 * <p>
 * Specification of task 2
 * Создать классы Siamese, Persian, Sphynx наследуемые от класса Cat.
 * Переопределить в них methods:
 * mew() – кот мяукает (каждый по разному)
 * purr() – кот мурлычет (каждый по разному)
 * <p>
 * Specification of task 3
 * Создать класс Person.
 * Создать Fields:
 * happiness - количество счастья у человека (в процентах)
 * Создать Constructors:
 * Person(happiness) - принимает количество счастья
 * Создать Methods:
 * changeHappiness(percentHappiness) - изменение счастья на percentHappiness
 * (может быть как положительное, так и отрицательное)
 * getHappiness() - получить количество счастья
 * setHappiness(happiness) - задать количество счастья
 * <p>
 * Specification of task 4
 * Перегрузить в классе Cat методы:
 * mew(Person) - кот мяукает для User, вызывает у него метод changeHappiness(percentHappiness),
 * где percentHappiness отрицательное число
 * purr(Person) - кот мурлычет для User, вызывает у него метод changeHappiness(percentHappiness),
 * где percentHappiness положительное число
 * <p>
 * Specification of task 5
 * Переопределить в классах Siamese, Persian, Sphynx методы:
 * mew(Person) - каждый кот по разному воздействует на счастье человека мяуканьем
 * purr(Person) - каждый кот по разному воздействует на счастье человека когда мурлыкает
 */

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {

    }

    public String mew() {
        return "Mew - Mew!";
    }

    public String mew(Person person) {
        person.changeHappiness(-10);
        return "Mew - Mew!";
    }

    public String purr() {
        return "MrrMrrM!";
    }

    public String purr(Person person) {
        person.changeHappiness(+10);
        return "MrrMrrM!";
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
}
