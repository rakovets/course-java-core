package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

/**
 * Specification of task 1
 * Создать класс Hero, представляющий собой героя и содержащий поле name.
 * Добавить конструктор, принимающий name героя и getter для name (setter не нужен).
 * Добавить метод attackEnemy(), выводящий в Standard Output сообщение о том,
 * что герой атакует врага (это временное решение).
 *
 * Specification of task 2
 * Создать классы Warrior, Mag и Archer, представляющие собой наследников класса Hero.
 * Переопределить в них метод attackEnemy() для вывода специализированного для этого класса сообщения об атаке.
 *
 * Specification of task 3
 * Создать класс Enemy, представляющий собой врага и содержащий поле health (количество здоровья).
 * Добавить конструктор, принимающий health, а также setter и getter.
 * Добавить метод takeDamage(int damage), который уменьшает health в соответствии с полученным damage.
 * Переписать метод attackEnemy() класса Hero, добавив ему параметр типа Enemy.
 * Метод должен вызывать у врага метод takeDamage() и передавать в него определённое количество damage.
 * Переопределить метод в подклассах Warrior, Mag и Archer так, чтобы наносимый damage был разный.
 *
 * Specification of task 4
 * Сделать абстрактными класс Hero и его метод attackEnemy().
 *
 * Specification of task 5
 * Создать интерфейс Mortal, содержащий метод isAlive().
 * Сделать так, чтобы класс Enemy реализовывал интерфейс Mortal.
 * Определить метод isAlive() в классе Enemy, чтобы тот возвращал true, если количество здоровья врага больше 0.
 *
 * Specification of task 6
 * Добавить герою показатель здоровья и возможность погибнуть.
 * Добавить возможность врагу атаковать героя в ответ.
 * Создать несколько видов врагов (наследников класса Enemy) с разными способностями.
 * Например, Zombie имеет шанс воскреснуть при гибели.
 * Дать героям уникальные способности.
 */

abstract public class Hero {
    private String name;
    private int health;

    public Hero(String name) {
        this();
        this.name = name;
    }

    public Hero() {
        health = 100;
    }

    public void takeDamageHero(int damage){
        health -= damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName() {
        return name;
    }
}
