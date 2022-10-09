package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Hero;

public class Zombie extends Enemy {
    private final int DAMAGE_ZOMBIE = 10;

    public Zombie(int health, boolean isAlive) {
        super(health, isAlive);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(DAMAGE_ZOMBIE);
    }

    public void doubleDamage(Hero hero) {
        hero.takeDamage(DAMAGE_ZOMBIE * 2);
    }
}
