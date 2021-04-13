package com.rakovets.course.java.core.practice.oop.principles.BATTLEGROUNDS;

import java.util.Random;

public class Skeleton extends Enemy{
    public Skeleton(int health) {
        super(health);
    }

    @Override //пассивный скилл
    public void takeDamage(int damage) {
        health -= 0.8f * damage;

    }
}
