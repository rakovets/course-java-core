package com.rakovets.course.java.core.practice.oop.principles.battle_ground_homework;

public class Enemy implements Mortal {
    private int health;
    private final int DAMAGE = 10;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage) {
        if (health - damage >= 0) {
            return health -= damage;
        } else {
            return health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attackHero (Hero hero) {
        hero.takeDamage(DAMAGE);
    }



}
