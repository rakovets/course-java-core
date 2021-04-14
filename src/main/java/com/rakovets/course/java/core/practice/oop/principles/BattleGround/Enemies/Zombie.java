package com.rakovets.course.java.core.practice.oop.principles.BattleGround.Enemies;

import java.util.Random;

public class Zombie extends Enemy{

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void reincarnation() {
        if(getHealth() < 1) {
            Random random = new Random();
            boolean chance = random.nextBoolean();
            if(chance) {
              setHealth(100);
            }
        }
    }

}
