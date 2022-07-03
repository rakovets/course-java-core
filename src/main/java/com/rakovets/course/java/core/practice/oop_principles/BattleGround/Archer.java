package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Archer extends Hero {

    public Archer(String name) {
        super(name, TypeHero.ARCHER);
        this.damage = 5;
    }

    public Archer(String name, int health) {
        super(name, health, TypeHero.ARCHER);
        this.damage = 5;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (getHealth() > 50) {
            enemy.takeDamage(damage * 2);
        } else {
            enemy.takeDamage(damage);
        }
    }
}
