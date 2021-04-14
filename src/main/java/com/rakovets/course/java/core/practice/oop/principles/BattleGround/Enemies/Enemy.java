package com.rakovets.course.java.core.practice.oop.principles.BattleGround.Enemies;

import com.rakovets.course.java.core.practice.oop.principles.BattleGround.Heroes.Hero;
import com.rakovets.course.java.core.practice.oop.principles.BattleGround.Mortal.Mortal;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }


    public void setHealth(int health) {
        this.health = health;
    }


    public void takeDamage(int damage) {
        health -= damage;
    }



    @Override
    public boolean isAlive() {
        if(health > 0) {
            System.out.println("Enemy is alive");
            return true;
        } else {
            System.out.println("Enemy is dead");
            return false;
        }
    }
    public void reincarnation(){
    }


    public void attackEnemy(Hero hero) {
        hero.takeDamage(10);
        System.out.println("Enemy attacks back");
    }
}
