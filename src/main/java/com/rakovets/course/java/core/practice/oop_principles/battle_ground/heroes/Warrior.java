package com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies.Enemy;

public class Warrior extends Hero {
    private double armor;

    public Warrior(String name) {
        super(name);
    }

    public Warrior(String name, double health, double armor) {
        super(name, health);
        this.armor = armor;
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        double damage = 20;
        if (enemy.isAlive()) {
            enemy.takeDamage(damage);
        }
        return "attacks enemy!";
    }

    @Override
    public void takeDamage(double damage) {
        if (isAlive()) {
            if (armor > 0) {
                setHealth(getHealth() - (damage / 2));
                armor -= damage / 2;
            } else {
                setHealth(getHealth() - damage);
            }
        }
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getArmor() {
        return armor;
    }
}
