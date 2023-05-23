package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name,health);
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage) {
        System.out.println(getName() + "uaaaaa...");
        enemy.takeDamage(50);
    }

    public  void multiKick(Enemy enemy, int damage) {
        System.out.println(getName() + "Рылко поцарапаю");
        enemy.takeDamage(300);
    }
}
