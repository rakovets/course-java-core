package com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies.Enemy;

public class Mag extends Hero {
    private double mana;
    public Mag(String name) {
        super(name);
    }

    public Mag(String name, double health, double mana) {
        super(name, health);
        this.mana = mana;
    }

    public String attackEnemy(Enemy enemy) {
        double damage = 10;
        double returnMana = 5;
        if (enemy.isAlive()) {
            enemy.takeDamage(damage);
            this.mana += returnMana;
        }
        return "Attacks enemy!";
    }

    public void makeHealingSpell() {
        double healingPriseInMana = 10;
        double healthPoints = 10;
        if (isAlive()) {
            if (mana > healingPriseInMana) {
                setHealth(getHealth() + healthPoints);
            }
        }
    }

    public boolean isAlive() {
        return this.getHealth() > 0;
    }
}
