package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Hero implements Mortal {
    final int HEALTH_HEAL_MAX = 100;
    private final String name;
    int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }
    @Override
    public boolean isAlive(int health) {
        return getHealth() > 0 ;
    }

    @Override
    public String aliveOrDead(int health) {
        return (getHealth() > 0) ?
                "It's OK! Not dead yet)" :
                "You're dead(";
    }
    public int takeDamage(int damage) {
        return this.health = getHealth() - damage;
    }
    public String getName() {
        return name;
    }
    public int getHealth () {
        return health;
    }

    public abstract int attackEnemy(Enemy enemy);
}
