package com.rakovets.course.java.core.practice.oop.principles.task02;

public class Archer extends Hero {

    public Archer(String name, int health){
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage) {
        System.out.println("I will hunt you down!");
        enemy.getDamage(damage);
        setHealth(getHealth()-takeDamageFromEnemy(enemy));
    }

    public int takeDamageFromEnemy(Enemy enemy) {

        return enemy.attackBack();
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
