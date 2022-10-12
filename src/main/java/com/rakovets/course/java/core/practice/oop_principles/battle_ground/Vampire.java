package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Vampire extends Enemy {
    private double healthRecovery = 1.2;
    public Vampire(String name, double health) {
        super(health);
        this.healthRecovery = health;
    }
    @Override
    public void attackHero(Hero hero) {
        double damage = 40;
        hero.takeDamage(damage);
    }
    @Override
    public void takeDamage(double damage) {
        this.setHealth(getHealth() * healthRecovery - damage);
    }



}
