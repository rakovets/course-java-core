package com.rakovets.course.java.core.practice.oop_principles.battle_Ground;

public class Mag extends Hero {
    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mag Attack Enemy!!!");
        if (enemy.isAlive()) {
            enemy.takeDamage(10);
        }
    }

    @Override
    public void skillHero(Enemy enemy) {
        int battleHeal = 15;
        if (this.getHealth() < 50 && this.getHealth() > 40) {
            setHealth(getHealth() + battleHeal);
        }
    }
}
