package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Vampire extends Enemy {
    public Vampire(int health) {
        super(health, TypeEnemy.VAMPIRE);
    }

    @Override
    public void attackHero(Hero hero) {
        if (hero.getTypeHero() == TypeHero.ARCHER || hero.getTypeHero() == TypeHero.WARRIOR) {
            hero.takeDamage(10);
        } else {
            hero.takeDamage(5);
        }
        this.setHealth(getHealth() + 5);
    }
}
