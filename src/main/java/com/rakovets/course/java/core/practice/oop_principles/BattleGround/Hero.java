package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public abstract class Hero implements Mortal {
    private final String name;
    private final TypeHero typeHero;
    protected int damage;
    private int health;

    public Hero(String name, TypeHero typeHero) {
        this.name = name;
        this.health = 100;
        this.typeHero = typeHero;
        this.damage = 5;
    }

    public Hero(String name, int health, TypeHero typeHero) {
        this.name = name;
        this.health = health;
        this.typeHero = typeHero;
        this.damage = 5;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public TypeHero getTypeHero() {
        return typeHero;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public abstract void attackEnemy(Enemy enemy);
}
