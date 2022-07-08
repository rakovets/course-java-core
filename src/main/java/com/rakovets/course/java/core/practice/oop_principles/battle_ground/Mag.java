package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Mag extends Hero {
    final int DAMAGE_MAG_SPELL = 25;
    final int HEALING_POINTS = 50;
    public Mag (String name, int health) {
        super(name, health);
    }
    @Override
    public int attackEnemy(Enemy enemy) {
        return enemy.takeDamage(DAMAGE_MAG_SPELL);
    }

    public int heal (int health, Mag mag) {
        health = mag.getHealth();
        if (mag.isAlive(health) && health < HEALTH_MAX - HEALING_POINTS) {
            if ((health + HEALING_POINTS) >= 100) {
                health = HEALTH_MAX;
            } else health = getHealth() + HEALING_POINTS;
        } health = getHealth();
        return health;
    }
}
