package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Hero;

public class Vampire extends Enemy {
    public Vampire(int health, boolean isAlive) {
        super(health, isAlive);
    }

    @Override
    public void attackHero(Hero hero) {
        final int DAMAGE_VAMPIRE = 30;
        hero.takeDamage(DAMAGE_VAMPIRE);
    }

    public void takeHealth(Hero hero) {
        final int TAKE_HEALTH = 10;
        hero.takeDamage(TAKE_HEALTH);
        setHealth(getHealth() + TAKE_HEALTH);
    }
}
