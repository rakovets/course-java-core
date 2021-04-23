package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Mag extends Hero {
    public Mag(String name) {
        super(name);
    }

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void takeDamage(int damage) {
        int damageReceive = damage * 2;
        this.setHealth(Math.max(this.getHealth() - damageReceive, 0));
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (this.isAlive() && enemy.isAlive()) {
            enemy.takeDamage(40);
        }
    }

    public void useFireBall(Enemy enemy) {
        if (this.isAlive() && enemy.isAlive()) {
            while (enemy.isAlive()) {
                enemy.takeDamage(60);
            }
        }
    }

    public void resurrectHero(Hero hero) {
        if (this.isAlive() && !hero.isAlive()) {
            hero.setHealth(100);
        }
    }
}
