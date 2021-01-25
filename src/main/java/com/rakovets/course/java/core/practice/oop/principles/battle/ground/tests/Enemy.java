package com.rakovets.course.java.core.practice.oop.principles.battle.ground.tests;

public class Enemy implements Mortal {
    private static int health;

    public Enemy(int health) {
        Enemy.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        Enemy.health = health;
    }

    public static int takeDamage(int damage) {
        return health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void attackHero(Hero hero) {

    }
}
