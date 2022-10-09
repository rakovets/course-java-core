package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Hero;

public class Witch extends Enemy {

    public Witch(int health, boolean isAlive) {
        super(health, isAlive);
    }

    @Override
    public void attackHero(Hero hero) {
        final int DAMAGE_WITCH = 20;
        hero.takeDamage(DAMAGE_WITCH);
    }

    public void resurrectionAfterDeath() {
        final int HEALTH_RESURRECTION = 100;
        if (this.getHealth() <= 0) {
            this.setHealth(HEALTH_RESURRECTION);
        }
    }
}
