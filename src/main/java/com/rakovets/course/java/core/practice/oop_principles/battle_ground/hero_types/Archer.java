package com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero_types;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Hero;

import java.util.Random;

public class Archer extends Hero {
    private final int archerDamage = 30;
    private Random random = new Random();

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(archerDamage);
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive() == true) {
            if (avoidAttack() == true) {
                super.takeDamage(0);
            } else {
                super.takeDamage(damage);
            }
        }
        if (isAlive() == false) {
            super.setHealth(0);
        }
    }

    public boolean avoidAttack() {
        int chanceAvoidAttack = random.nextInt(2);
        if (chanceAvoidAttack == 1) {
            return true;
        } else {
            return false;
        }
    }
}
