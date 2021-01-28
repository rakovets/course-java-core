package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Mag extends Hero {
    public Mag(String name) {
        super(name);
    }

    public Mag (String name, int health) {
        super(name, health);
    }

    @Override
    public void takeDamage(int damage) {
        int damageVulnerability = damage * 2;
        this.setHealth(Math.max(this.getHealth() - damageVulnerability, 0));
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (this.isAlive() && enemy.isAlive()) {
            enemy.takeDamage(30);
        }
    }

    public void curseEnemy(Enemy enemy) {
        if (this.isAlive() && enemy.isAlive()) {
            while (enemy.isAlive()) {
            enemy.takeDamage(30);
            }
        }
    }

    public void resurrectHero(Hero hero) {
        if (this.isAlive() && !hero.isAlive()) {
            hero.setHealth(100);
        }
    }
}
