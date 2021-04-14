package com.rakovets.course.java.core.practice.oop.principles.BattleGround.Heroes;

import com.rakovets.course.java.core.practice.oop.principles.BattleGround.Enemies.Enemy;

public class Mag extends Hero{
    public Mag(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(25);
        System.out.println("Mag attacks Enemy");
    }

    @Override
    public void uniqueSkill(Enemy enemy) {
        enemy.takeDamage(75);
        System.out.println("Mag uses Magic Arrow");
    }

}
