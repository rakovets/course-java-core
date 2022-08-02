package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Enemy implements Mortal {
    private final String name;
    private int health;
    private int defaultDamage;
    private int comboDamage;

    public Enemy (String name) {
        this.name = name;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract String attackHero(Hero hero);

    public String getName() {
        return name;
    }

    public int getDefaultDamage() {
        return defaultDamage;
    }

    public void setDefaultDamage(int default_damage) {
        this.defaultDamage = default_damage;
    }

    public int getComboDamage() {
        return comboDamage;
    }

    public void setComboDamage(int comboDamage) {
        this.comboDamage = comboDamage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
