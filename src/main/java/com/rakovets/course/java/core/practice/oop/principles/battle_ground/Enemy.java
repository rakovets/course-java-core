package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public abstract class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        if (health > 0 ) {
            this.health = health;
        }
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int healthUpdate) {
        if (healthUpdate >= 0) {
            this.health = healthUpdate;
        }
    }

    public void takeDamage(int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        } else {
            this.health = 0;
        }
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    public abstract void attackHero(Hero hero);
}
