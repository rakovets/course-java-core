package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Vampire extends Enemy {

    public Vampire() {
        super(TypeEnemy.VAMPIRE);
        this.damage = 5;
    }

    public Vampire(int health) {
        super(health, TypeEnemy.VAMPIRE);
        this.damage = 5;
    }

    @Override
    public void attackHero(Hero hero) {
        if (hero.getTypeHero() == TypeHero.MAG) {
            hero.takeDamage(damage);
        } else {
            hero.takeDamage(damage * 2);
        }
        int vampireHealthIncreaseFactor = 5;
        this.setHealth(getHealth() + vampireHealthIncreaseFactor);
    }
}
