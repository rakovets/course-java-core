package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy_types;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Hero;

import java.util.Random;

public class Zombie extends Enemy {
    private final int zombieDamage = 10;
    private Random random = new Random();

    public Zombie(int health) {
        super(health);
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(zombieDamage);
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive() == true) {
            super.takeDamage(damage);
        }
        if (isAlive() == false) {
            resurrection();
        }
    }

    public void resurrection() {
        int chanceResurrection = random.nextInt(2);
        if (chanceResurrection == 1) {
            super.setHealth(50);
        } else {
            super.setHealth(0);
        }
    }
}
