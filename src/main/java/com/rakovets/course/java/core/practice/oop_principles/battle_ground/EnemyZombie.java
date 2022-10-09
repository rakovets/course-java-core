package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class EnemyZombie extends Enemy {
    private final int DAMAGE_ZOMBIE = 50;
    private final int AMOUNT_HEALTH_RESURRECTION = 100;

    public EnemyZombie(int health, boolean isAlive) {
        super(health, isAlive);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(DAMAGE_ZOMBIE);
    }

    public void resurrection() {
        setHealth(AMOUNT_HEALTH_RESURRECTION);
    }
}
