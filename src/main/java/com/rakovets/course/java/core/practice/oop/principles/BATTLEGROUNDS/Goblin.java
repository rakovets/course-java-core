package com.rakovets.course.java.core.practice.oop.principles.BATTLEGROUNDS;

import java.util.Random;

public class Goblin extends Enemy{
    public Goblin(int health) {
        super(health);
    }

    @Override
    public void attackEnemy(Hero hero) {
        hero.takeDamage((int) (10 + (0.1f * health)));
        System.out.println("enemy attacking u");
    }
}

