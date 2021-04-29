package com.rakovets.course.java.core.practice.oop.principles.hero;

import java.util.Random;

public class Undead extends Enemy {
    public Undead(int health, int damageEnemy) {
        super(health, damageEnemy);
    }

    public void specialPower() {
        if (getHealth() <= 0) {
            Random random = new Random();
            boolean live = random.nextBoolean();
            if (live) {
                setHealth(200);
            }
        }
    }
}
