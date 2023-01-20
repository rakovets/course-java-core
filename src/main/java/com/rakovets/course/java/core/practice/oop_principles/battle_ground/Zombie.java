package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = 4;
        hero.takeDamage(damage);
    }

    public void resurrection() {
        int healthAfterResurrection = 30;
        int totalResurrection = 3;
        int deathCounter = 0;
        while (!isAlive() && deathCounter < totalResurrection) {
            setHealth(healthAfterResurrection);
            deathCounter++;
        }
    }
}
