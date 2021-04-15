package com.rakovets.course.java.core.practice.oop.principles.project.battle.ground;

public abstract class Enemy implements Mortal {
    protected int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void takeSkillDamage(int damage) {
        health -= damage;
    }

    public void massiveDamage(int damage) {
        health -= damage;
    }

    public void attackHero(Hero hero) {
    }

    @Override
    public boolean isAlive() {
            return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public int setHealth(int health) {
        return this.health = health;
    }
}
