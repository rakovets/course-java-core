package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Enemy {
    private final int WARRIOR_DAMAGE = 25;
    private final int WARRIOR_FACTOR = 2;

    public Warrior(int health, boolean isAlive) {
        super(health, isAlive);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(WARRIOR_DAMAGE / WARRIOR_FACTOR);
    }
}
