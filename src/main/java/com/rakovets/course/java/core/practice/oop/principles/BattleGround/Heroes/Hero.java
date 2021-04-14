package com.rakovets.course.java.core.practice.oop.principles.BattleGround.Heroes;

import com.rakovets.course.java.core.practice.oop.principles.BattleGround.Enemies.Enemy;

public abstract class Hero {
    private String name;
    private int healthPoints;


    public Hero(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }


    public String getName() {
        return name;
    }


    public void takeDamage(int damage) {
        healthPoints -= damage;
    }

    public void attackEnemy(Enemy enemy) {
    }
    public void uniqueSkill(Enemy enemy) {
    }


    public int getHealthPoints() {
        return healthPoints;
    }

    public void death() {
        if(healthPoints > 0) {
            System.out.println("Hero is alive");
        } else if(healthPoints < 0){
            System.out.println("Hero is death");
        } else {
            System.out.println("Hero is in parallel world");
        }
    }


    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
