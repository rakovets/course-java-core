package com.rakovets.course.java.core.practice.oop_principles.battleground.heroes;

import com.rakovets.course.java.core.practice.oop_principles.battleground.enemies.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battleground.Mortal;

public class Mag extends Hero implements Mortal {
    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Маг атакует врага!");
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(60);
    }

    public void takeDamage(int damage) {
        int healthAfterTakenDamage = getHealth()-damage;
        setHealth(healthAfterTakenDamage);
    }

    @Override
    public boolean isAlive(int health) {
        return (health <= 0) ? true : false;
    }
}
