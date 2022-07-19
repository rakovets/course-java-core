package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Skeleton extends Enemy {
    public Skeleton(int health) {
        super(health);
    }

    public int addHealth() {
        if (getHealth() <= 0) {
            return getHealth() + 100;
        } else {
            return getHealth();
        }
    }
}
