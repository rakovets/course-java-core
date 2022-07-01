package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Mag extends Hero {
    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage) {
        if (isAlive()) {
            enemy.takeDamage(damage * PERCENT_OF_DAMAGE);
        } else {
            System.out.println("He is dead.");
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            setHealth(getHealth() - damage);
        } else {
            System.out.println("He is dead.");
        }
    }

    public void healing(Hero hero, int heal) {
        hero.setHealth(hero.getHealth() + (hero.getHealth() / PERCENT_OF_DAMAGE * 5));
    }
}
