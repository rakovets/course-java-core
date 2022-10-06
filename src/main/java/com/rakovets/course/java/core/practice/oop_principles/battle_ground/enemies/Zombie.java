package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Hero;

public class Zombie extends Enemy{
    private double maxHealth;
    private int chanceToBeAlive;
    public Zombie(double health) {
        super(health);
    }

    public Zombie (String name, double health) {
        super(name, health);
        this.maxHealth = health;
    }

    public String attackHero(Hero hero) {
        double damage = 10;
        if (hero.isAlive()) {
            hero.takeDamage(damage);
        }
        return "Attacks this hero!";
    }

    public void getAlive() {
        chanceToBeAlive = 2;
        if (!isAlive() && chanceToBeAlive > 0) {
            setHealth(maxHealth / 2);
            chanceToBeAlive -= 1;
        }
    }

    public boolean isAlive() {
        return this.getHealth() > 0;
    }
}
