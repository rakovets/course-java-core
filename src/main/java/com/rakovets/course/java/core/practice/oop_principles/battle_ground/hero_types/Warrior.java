package com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero_types;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Hero;
import java.util.Random;

public class Warrior extends Hero {
    private final int warriorDamage = 20;
    private Random random = new Random();

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(warriorDamage);
        if (extraAttack() == true) {
            enemy.takeDamage(warriorDamage);
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

    public boolean extraAttack() {
        int chanceExtraAttack = random.nextInt(2);
        if (chanceExtraAttack == 1) {
            return true;
        } else {
            return false;
        }
    }
}
