package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Undead extends Enemy {
    public Undead(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = 14;
        hero.takeDamage(damage);
    }

    public void resurrection() {
        int healthAfterResurrection = 50;
        int totalResurrection = 3;
        int deathCounter = 0;
        while (!isAlive() && deathCounter < totalResurrection) {
            setHealth(healthAfterResurrection);
            deathCounter++;
        }
    }
}
