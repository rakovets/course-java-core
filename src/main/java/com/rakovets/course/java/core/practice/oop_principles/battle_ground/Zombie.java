package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Zombie extends Enemy {
    private int resurrectionCount = 1;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) setHealth(getHealth() - damage);
        if (!isAlive()) resurrection();
    }

    private void resurrection() {
        if (resurrectionCount > 0) {
            setHealth(70);
            this.resurrectionCount -=1;
        }
    }
}
