package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Hero;

public class Zombie extends Enemy {
    private double maxHealth;
    private int chanceToBeAlive;

    public Zombie(double health) {
        super(health);
    }

    public Zombie(String name, double health, int chanceToBeAlive) {
        super(name, health);
        this.chanceToBeAlive = chanceToBeAlive;
        this.maxHealth = health;
    }

    @Override
    public String attackHero(Hero hero) {
        double damage = 15;
        if (hero.isAlive()) {
            hero.takeDamage(damage);
        }
        return "attacks this hero!";
    }

    public void getAlive() {
        if (!isAlive() && chanceToBeAlive > 0) {
            if (getHealth() < 0) {
                setHealth(0);
            }
            setHealth(maxHealth / 2);
            chanceToBeAlive -= 1;
        }
    }
}
