package com.rakovets.course.java.core.practice.oop.principles.BATTLEGROUNDS;

import java.util.Random;

public class Beast extends Enemy{
    public Beast(int health){
        super(health);
    }
    final Random random = new Random();

    @Override
    public void takeDamage(int damage) {
        if (health < 50){
            health -= damage/2;
        }
        else {
            health -= damage;
        }
    }
}
