package com.rakovets.course.java.core.practice.oop_principles.project_pubg;

public class Necromancer extends Enemy {
    public Necromancer(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(2);
    }

    public void changeHeroHp(Hero hero) {
        hero.setHealth(hero.getHealth() - 50);
    }
}
