package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class HighOrc extends Enemy{
    private boolean firstHitImmunity = true;

    HighOrc(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        if (this.firstHitImmunity) {
            this.firstHitImmunity = false;
        }else if (isAlive()) {
            setHealth(getHealth() - damage);
        }
    }
}
