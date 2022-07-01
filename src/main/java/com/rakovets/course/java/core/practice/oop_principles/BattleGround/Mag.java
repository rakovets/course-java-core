package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Mag extends Hero {
    public Mag(String name) {
        super(name);
    }

    public Mag(String name, int health) {
        super(name, health, TypeHero.MAG);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (enemy.getTypeEnemy() == TypeEnemy.WITCH) {
            enemy.takeDamage(10);
        } else {
            enemy.takeDamage(5);
        }
    }
}
