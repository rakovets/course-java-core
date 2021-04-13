package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import java.util.Random;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    public void specialPower() {
        if (getHealthy() <= 0) {
            Random random = new Random();
            boolean live = random.nextBoolean();
            if (live) {
                setHealthy(100);
            }
        }
    }
}
