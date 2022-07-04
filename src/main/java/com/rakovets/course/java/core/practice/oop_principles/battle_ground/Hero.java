package com.rakovets.course.java.core.practice.oop_principles.battle_ground;
public abstract class Hero implements Mortal {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String attackEnemy() {
        return "The hero attacks the enemy";
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
