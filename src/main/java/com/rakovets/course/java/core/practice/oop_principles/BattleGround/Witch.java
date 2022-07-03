package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Witch extends Enemy {

    public Witch() {
        super(TypeEnemy.WITCH);
        this.damage = 5;
    }

    public Witch(int health) {
        super(health, TypeEnemy.WITCH);
        this.damage = 5;
    }

    @Override
    public void attackHero(Hero hero) {
        if (hero.getTypeHero() == TypeHero.MAG) {
            hero.takeDamage(damage * 2);
        } else {
            hero.takeDamage(damage);
        }
    }
}
