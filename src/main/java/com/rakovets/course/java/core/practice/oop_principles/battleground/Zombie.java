package com.rakovets.course.java.core.practice.oop_principles.battleground;

import java.util.Random;

public class Zombie extends Enemy {
    public Zombie(int health, boolean isAlive) {
        super(health, isAlive);
    }

    @Override
    public void attackHero(Hero hero) {
        final int ZOMBIE_DAMAGE = 8;
        hero.takeDamage(ZOMBIE_DAMAGE);
    }

    public void resurrection() {
        if (this.getHealth() <= 0 && !this.isAlive()) {
            int min = 0;
            int max = 10;
            Random random = new Random();
            int chance = random.nextInt(max + min) + min;
            if (chance > 5) {
                this.setAlive(true);
                this.setHealth(100);
            }
        }
    }
}
