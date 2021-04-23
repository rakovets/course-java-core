package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Necromant extends Enemy{
    public Necromant(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        if (damage > 20) {
            int divineHealth = getHealth() - (damage / 2);
            this.setHealth(Math.max(divineHealth, 0));
        }
    }

    @Override
    public void attackHero(Hero hero) {
        if (this.isAlive() && hero.isAlive()) {
            hero.takeDamage(30);
        }
    }

    public void resurrectEnemy(Enemy enemy) {
        if (isAlive() && !enemy.isAlive()) {
            enemy.setHealth(30);
        }
    }
}
