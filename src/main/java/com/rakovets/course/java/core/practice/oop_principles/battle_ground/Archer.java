package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.example.enum_types.model.Sunday;

import java.util.Random;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage) {
        if (isAlive()) {
            enemy.takeDamage(damage + (PERCENT_OF_DAMAGE / 5));
            enemy.takeDamage(damage + (PERCENT_OF_DAMAGE / 5));
        } else {
            System.out.println("He is dead.");
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            if (!dodge()) {
                setHealth(getHealth() - damage);
            }
        } else {
            System.out.println("He is dead.");
        }
    }

    private static boolean dodge() {
        return new Random().nextBoolean();
    }
}
