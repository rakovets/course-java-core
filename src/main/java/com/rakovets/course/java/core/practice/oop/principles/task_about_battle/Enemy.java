package com.rakovets.course.java.core.practice.oop.principles.task_about_battle;

public class Enemy implements Moral {
    private int health;
    private final int DAMAGE_ENEMY = 15;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getDAMAGE_ENEMY(){
        return DAMAGE_ENEMY;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage) {
        health -= damage;
        if (health < 0 ) {
            health = 0;
        }
        return health;
    }

    @Override
    public boolean isAlive() {
        if (getHealth() > 0) {
            return true;
        }
        return false;
    }

    public int attackHero(Hero hero) {
        return hero.takeDamageFromEnemy(DAMAGE_ENEMY);
    }
}

