package com.rakovets.course.java.core.practice.oop_principles.battle_Ground;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior Attack Enemy!!!");
        if (enemy.isAlive()) {
            enemy.takeDamage(5);
        }
    }

    @Override
    public void skillHero(Enemy enemy) {
        final int lethal = 99;
        if (this.getHealth() < 20) {
            enemy.takeDamage(lethal);
        }
    }
}
