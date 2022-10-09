package com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Hero;

public class Mag extends Hero {
    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        final int DAMAGE_MAG = 20;
        if (enemy.isAlive()) {
            enemy.takeDamage(DAMAGE_MAG);
        }
    }

    public void doubleDamage(Enemy enemy) {
        if (enemy.isAlive()) {
            attackEnemy(enemy);
            attackEnemy(enemy);
        }
    }

    @Override
    public boolean isAlive() {
        return super.getHealth() > 0;
    }
}
