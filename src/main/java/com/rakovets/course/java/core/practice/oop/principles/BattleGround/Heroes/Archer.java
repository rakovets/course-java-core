package com.rakovets.course.java.core.practice.oop.principles.BattleGround.Heroes;

import com.rakovets.course.java.core.practice.oop.principles.BattleGround.Enemies.Enemy;

public class Archer extends Hero{
    public Archer(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(70);
        System.out.println("Archer attacks Enemy");
    }


    public void uniqueSkill(Enemy enemy) {
        enemy.takeDamage(30);
        System.out.println("Archer gives more damage with fire arrows");
    }

}
