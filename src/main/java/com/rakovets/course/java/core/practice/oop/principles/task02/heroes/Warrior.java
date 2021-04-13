package com.rakovets.course.java.core.practice.oop.principles.task02.heroes;

import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Enemy;

public class Warrior extends Hero {

    public Warrior(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("I will fight with honor!");
        enemy.getDamage(getAttack());
    }

    @Override
    public void getDamageFromEnemy(int damage) {

    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
