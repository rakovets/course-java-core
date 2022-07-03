package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Mag extends Hero {

    public Mag(String name) {
        super(name, TypeHero.MAG);
        this.damage = 5;
    }

    public Mag(String name, int health) {
        super(name, health, TypeHero.MAG);
        this.damage = 5;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (enemy.getTypeEnemy() == TypeEnemy.WITCH) {
            enemy.takeDamage(damage * 2);
        } else {
            enemy.takeDamage(damage);
        }
    }
}
