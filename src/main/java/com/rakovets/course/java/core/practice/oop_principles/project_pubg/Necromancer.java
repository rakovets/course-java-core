package com.rakovets.course.java.core.practice.oop_principles.project_pubg;

public class Necromancer extends Enemy {
    public Necromancer() {
    }

    public Necromancer(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        int attackDamage = 2;
        hero.takeDamage(attackDamage);
    }

    public void changeHeroHp(Hero hero) {
        hero.setHealth(hero.getHealth() - 50);
    }
}
