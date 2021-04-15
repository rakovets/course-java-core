package com.rakovets.course.java.core.practice.oop.principles.project.battle.ground;

public class Zombie extends Enemy {
    private final int armorRate = 5;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        health = (health - (damage - armorRate));
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
        hero.takeDamage(10);
    }
}
