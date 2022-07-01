package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private TypeHero typeHero;

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Hero(String name, int health,TypeHero typeHero) {
        this.name = name;
        this.health = health;
        this.typeHero=typeHero;
    }

    public TypeHero getTypeHero() {
        return typeHero;}

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public abstract void attackEnemy(Enemy enemy);
}
