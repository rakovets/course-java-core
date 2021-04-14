package com.rakovets.course.java.core.practice.oop.principles.BattleGround.Heroes;

import com.rakovets.course.java.core.practice.oop.principles.BattleGround.Enemies.Enemy;

public class Warrior extends Hero{
    public Warrior(String name, int healthPoints) {
        super(name, healthPoints);
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(50);
        System.out.println("Warrior attacks Enemy");
        enemy.takeDamage(50);
        System.out.println("Warrior attacks Enemy with passive skill 'Fury' ");
    }


}
