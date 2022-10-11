package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Hero;

public class Werewolf extends Enemy {
    private double maxHealth;

    public Werewolf(double health) {
        super(health);
    }

    public Werewolf(String name, double health) {
        super(name, health);
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

    public String clawedHit(Hero hero) {
        double clawsBuff = 5;
        double damage = 15 + clawsBuff;
        if (hero.isAlive()) {
            hero.takeDamage(damage);
        }
        return "attacks this hero with CLAWS!";
    }

    @Override
    public void takeDamage(double damage) {
        double lowHealthPoints = maxHealth / 3;
        double healingAbility = 5;
        if (isAlive()) {
            setHealth(getHealth() - damage);
            if (getHealth() < lowHealthPoints) {
                setHealth(getHealth() + healingAbility);
            }
        }
    }
}
