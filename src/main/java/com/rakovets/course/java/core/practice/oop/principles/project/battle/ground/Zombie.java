package com.rakovets.course.java.core.practice.oop.principles.project.battle.ground;

public class Zombie extends Enemy {
    private final static int ARMOR_RATE = 5;
    private final static int DAMAGE = 10;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        health = (health - (damage - ARMOR_RATE));
        if (health <= 0) {
            setHealth(50);
        }
    }

    @Override
    public void takeSkillDamage(int damage) {
        health = health - damage;
    }

    @Override
    public void massiveDamage(int damage) {
        takeDamage(damage);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(DAMAGE);
    }
}
