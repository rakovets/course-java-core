package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy_types;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Hero;

import java.util.Random;

public class Werewolf extends Enemy {
    private final int werewolfDamage = 25;
    private Random random = new Random();

    public Werewolf(int health) {
        super(health);
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(werewolfDamage);
        if (healingAttack() == true) {
            super.setHealth(getHealth() + 30);
        }
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

    public boolean healingAttack() {
        int chanceHealingAttack = random.nextInt(2);
        if (chanceHealingAttack == 1) {
            return true;
        } else {
            return false;
        }
    }
}
