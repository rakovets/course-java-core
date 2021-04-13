package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import java.util.Random;

public class Spirit extends Enemy {
    public Spirit(int health) {
        super(health);
    }

    public boolean isSpecialPower() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
