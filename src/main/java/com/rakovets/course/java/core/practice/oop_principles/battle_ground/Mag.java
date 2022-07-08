package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Mag extends Hero {
    final int DAMAGE_MAG_SPELL = 25;
    final int HEALING_POINTS = 50;

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        return enemy.takeDamage(DAMAGE_MAG_SPELL);
    }

    public int heal(Hero hero) {
        this.health = hero.getHealth();
        if (hero.isAlive(health)) {
            health = health + HEALING_POINTS;
        }
        return health;
    }
}
