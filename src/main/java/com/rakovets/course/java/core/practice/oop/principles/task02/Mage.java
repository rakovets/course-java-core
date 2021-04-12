package com.rakovets.course.java.core.practice.oop.principles.task02;

public class Mage extends Hero {

    public Mage(String name, int health){
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy,int damage) {
        System.out.println("Your soul shall be mine!");
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
