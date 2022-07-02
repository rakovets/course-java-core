package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Vampire extends Enemy {

    public Vampire() {
        super(TypeEnemy.VAMPIRE);
    }

    public Vampire(int health) {
        super(health, TypeEnemy.VAMPIRE);
    }

    @Override
    public void attackHero(Hero hero) {
        if (hero.getTypeHero() == TypeHero.MAG) {
            hero.takeDamage(5);
        } else {
            hero.takeDamage(10);
        }
        this.setHealth(getHealth() + 5);
    }
}
