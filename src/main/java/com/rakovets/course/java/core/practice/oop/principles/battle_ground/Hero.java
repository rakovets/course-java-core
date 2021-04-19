package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public abstract class Hero implements Mortal {

    protected String name;
    protected int heroHealth;

    public Hero(String name, int heroHealth) {
        this.name = name;
        this.heroHealth = heroHealth;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        heroHealth -= damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return heroHealth;
    }

    public void setHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    @Override
    public boolean isAlive() {
        System.out.printf("Hero is alive!\n");
        return heroHealth > 0;
    }
}
