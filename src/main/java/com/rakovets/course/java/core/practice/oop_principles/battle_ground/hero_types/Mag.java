package com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero_types;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Hero;

import java.util.Random;

public class Mag extends Hero {
    private final int magDamage = 40;
    private Random random = new Random();

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(magDamage);
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive() == true) {
            super.takeDamage(damage);
        } else {
            super.setHealth(0);
        }
        if (isAlive() == true) {
            if (healthRecovery() == true) {
                super.setHealth(getHealth() + 40);
            }
        } else {
            super.setHealth(0);
        }
    }

    public boolean healthRecovery() {
        int chanceHealthRecovery = random.nextInt(2);
        if (chanceHealthRecovery == 1) {
            return true;
        } else {
            return false;
        }
    }
}
