package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Witch extends Enemy {

    public Witch() {
        super(TypeEnemy.WITCH);
    }

    public Witch(int health) {
        super(health, TypeEnemy.WITCH);
    }

    @Override
    public void attackHero(Hero hero) {
        if (hero.getTypeHero() == TypeHero.MAG) {
            hero.takeDamage(10);
        } else {
            hero.takeDamage(5);
        }
    }
}
