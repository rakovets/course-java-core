package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Ghost extends Enemy {
    private int invisibility;

    public Ghost(String name, int health) {
        super(health);
        this.invisibility = health;
    }
    @Override
    public void attackHero(Hero hero) {
        double damage = 30;
        hero.takeDamage(damage);
    }
    @Override
    public void takeDamage(double damage) {
        for (int i = 0; i < 3; i++) {
            this.setHealth(getHealth());
        }
         this.setHealth(getHealth() - damage);
    }
}
