package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy_types;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Hero;

import java.util.Random;

public class Vampire extends Enemy {
    private final int vampireDamage = 15;
    private int biteDamage = 0;
    private int totalBiteDamage;
    private Random random = new Random();

    public Vampire(int health) {
        super(health);
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(vampireDamage);
        hero.takeDamage(seriesOfBites());
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive() == true) {
            super.takeDamage(damage);
        } else {
            super.setHealth(0);
        }
        if (isAlive() == false) {
            super.setHealth(0);
        }
    }

    public int seriesOfBites() {
        int chanceSeriesOfBites = random.nextInt(2);
        if (chanceSeriesOfBites == 1) {
            biteDamage += vampireDamage;
            seriesOfBites();
        } else {
            totalBiteDamage = biteDamage;
            biteDamage = 0;
        }
        return totalBiteDamage;
    }
}
