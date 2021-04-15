package com.rakovets.course.java.core.practice.oop.principles.project.battle.ground;

public class Ghost extends Enemy {
    protected final int armorRate = 15;

    public Ghost(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        int i = (int) (Math.random() * 2);
        if (i == 1) {
            health = health - (damage - armorRate);
        } else {
            System.out.println("You miss!\n" + getHealth());
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
        hero.takeDamage(25);
    }
}
