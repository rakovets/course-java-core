package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public abstract class Enemy implements Mortal {
    private int health;
    private TypeEnemy typeEnemy;

    public Enemy(int health) {
        this.health = health;
    }

    public Enemy(int health,TypeEnemy typeEnemy) {
        this.health = health;
        this.typeEnemy=typeEnemy;
    }

    public TypeEnemy getTypeEnemy() {
        return typeEnemy;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void takeDamage(int damage, Hero hero) {
        this.health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackHero(Hero hero);
}
