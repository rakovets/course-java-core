package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Zombie extends Enemy {
    private final int ZOMBIE_DAMAGE = 20;
    private final int REVIVE_HEALTH = 100;

    public Zombie(int health, boolean isAlive) {
        super(health, isAlive);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(ZOMBIE_DAMAGE);
    }

    public void revival() {
        setHealth(REVIVE_HEALTH);
    }
}
