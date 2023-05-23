package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Archer extends Hero{

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage) {
        System.out.println(getName() + "uaaaaa...");
        enemy.takeDamage(100);
    }

    public  void superArrow(Enemy enemy, int damage) {
        System.out.println(getName() + "Moon arrow");
        enemy.takeDamage(500);
    }
}
