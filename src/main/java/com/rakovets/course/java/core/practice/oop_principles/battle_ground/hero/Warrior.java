package com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Hero;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        final int DAMAGE_WARRIOR = 30;
        if (enemy.isAlive()) {
            enemy.takeDamage(DAMAGE_WARRIOR);
        }
    }

    public void deathPunch(Enemy enemy) {
        if (enemy.isAlive()) {
            enemy.takeDamage(enemy.getHealth());
        }
    }

    @Override
    public boolean isAlive() {
        return super.getHealth() > 0;
    }
}
