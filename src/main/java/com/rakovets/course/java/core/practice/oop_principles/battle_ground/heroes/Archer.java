package com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies.Enemy;

public class Archer extends Hero {
    private int fireArrowsNumber;

    public Archer(String name) {
        super(name);
    }

    public Archer(String name, double health, int fireArrowsNumber) {
        super(name, health);
        this.fireArrowsNumber = fireArrowsNumber;
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        double damage = 13;
        if (enemy.isAlive()) {
            enemy.takeDamage(damage);
        }
        return "attacks enemy!";
    }

    public String fireArrowAttack(Enemy enemy) {
        double damageByFireArrow = 7;
        double damage = 13;
        damage += damageByFireArrow;
        if (enemy.isAlive() && fireArrowsNumber > 0) {
            enemy.takeDamage(damage);
            this.fireArrowsNumber -= 1;
        }
        return "attacks enemy with fire!";
    }

    public int getFireArrowsNumber() {
        return fireArrowsNumber;
    }
}
