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

    public abstract void attackHero(Hero hero);

    @Override
    public boolean isAlive() {
            return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
