package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Zombie extends Enemy {

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamageHero(20);
    }

    public int attackMag() {
        Mag mag = new Mag("Mag", 2);
        Zombie zombie = new Zombie(50);
        mag.attackEnemy(zombie);
        return zombie.getHealth() / 2;
    }
}
