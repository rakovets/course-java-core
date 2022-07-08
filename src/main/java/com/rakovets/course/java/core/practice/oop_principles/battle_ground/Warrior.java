package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero {
    private static final int WARRIOR_DAMAGE_REDUCTION = 3;

    public Warrior(String name) {
        super(name);
        this.damage = 15;
    }

    public Warrior(String name, int health) {
        super(name, health);
        this.damage = 15;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage - WARRIOR_DAMAGE_REDUCTION);
    }
}
