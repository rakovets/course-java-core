package com.rakovets.course.java.core.practice.oop.principles;

public class Mag extends Hero {
    public static final int ATTACK = 20;

    public Mag(String name, double health) {
        super(name, health);
    }

    public void attackEnemy() {
        System.out.println("Mag is attacking Enemy");
    }

    public void attackEnemy(Enemy enemy) {
        attackEnemy();
        setHealth(getHealth() + 1);
        enemy.takeDamage(ATTACK);
    }

}
