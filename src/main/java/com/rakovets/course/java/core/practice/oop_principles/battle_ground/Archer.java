package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.example.enum_types.model.Sunday;

import java.util.Random;

public class Archer extends Hero {
    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
            enemy.takeDamage(getDamage() / 5);
            enemy.takeDamage(getDamage() / 5);
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            if (!dodge()) {
                setHealth(getHealth() - damage);
            }
        }
    }

    private static boolean dodge() {
        return new Random().nextBoolean();
    }
}
