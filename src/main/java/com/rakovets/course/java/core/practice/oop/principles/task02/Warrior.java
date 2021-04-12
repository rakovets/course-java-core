package com.rakovets.course.java.core.practice.oop.principles.task02;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage) {
        System.out.println("I will fight with honor!");
        enemy.getDamage(damage);
        setHealth(getHealth()-takeDamegeFromEnemy(enemy));

    }

    @Override
    public int takeDamegeFromEnemy(Enemy enemy) {

        return enemy.attackBack();
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
