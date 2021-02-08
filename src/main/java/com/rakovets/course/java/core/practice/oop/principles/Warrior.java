package com.rakovets.course.java.core.practice.oop.principles;

public class Warrior extends Hero {
    public static final int ATTACK = 15;

    public Warrior(String name, double health) {
        super(name, health);
    }

    public void attackEnemy() {
        System.out.println("Warrior is attacking Enemy");
    }

    public void attackEnemy(Enemy enemy) {
        attackEnemy();
        enemy.takeDamage(ATTACK);
    }

    public void takeDamage(int damage) {
        setHealth(getHealth() - damage + 1);
    }

}
