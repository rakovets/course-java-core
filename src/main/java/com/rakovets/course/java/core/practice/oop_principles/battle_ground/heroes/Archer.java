package com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies.Enemy;

public class Archer extends Hero {
    private int fireArrowsNumber = 5;
    public Archer(String name) {
        super(name);
    }

    public String attackEnemy(Enemy enemy) {
        double damage = 13;
        if (enemy.isAlive()) {
            enemy.takeDamage(damage);
        }
        return "Attacks enemy!";
    }

    public String fireArrowAttack(Enemy enemy) {
        double damageByFireArrow = 7;
        double damage = 13 + damageByFireArrow;
        if (enemy.isAlive() && fireArrowsNumber > 0) {
            enemy.takeDamage(damage);
            this.fireArrowsNumber -= 1;
        }
        return "Attacks enemy with fire!";
    }

    public boolean isAlive() {
        return this.getHealth() > 0;
    }

    public int getFireArrowsNumber() {
        return fireArrowsNumber;
    }
}
