package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private TypeHero typeHero;

    public Hero(String name, TypeHero typeHero) {
        this.name = name;
        this.health = 100;
        this.typeHero = typeHero;
    }

    public Hero(String name, int health, TypeHero typeHero) {
        this.name = name;
        this.health = health;
        this.typeHero = typeHero;
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

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public abstract void attackEnemy(Enemy enemy);
}
