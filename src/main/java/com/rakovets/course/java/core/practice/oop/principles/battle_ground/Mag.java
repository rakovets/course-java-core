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
        int magVulnerability = damage * 2;
        setHealth(this.getHealth() - magVulnerability);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(30);
    }

    public void curseEnemy(Enemy enemy) {
        while (enemy.isAlive() && !(enemy instanceof Angel)) {
            enemy.takeDamage(5);
        }
    }

    public void resurrectHero(Hero hero) {
        if (!hero.isAlive()) {
            hero.setHealth(50);
        }
    }
}
