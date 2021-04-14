package com.rakovets.course.java.core.practice.oop.principles.BattleGround.Enemies;

import com.rakovets.course.java.core.practice.oop.principles.BattleGround.Heroes.Hero;

public class Brigant extends Enemy{
    public Brigant(int health) {
        super(health);
    }



    public void attackEnemy(Hero hero) {
        hero.takeDamage(20);
    }
}
