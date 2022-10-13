package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(20);
    }

    public int attackEnemyOfMag(Mag mag, Zombie zombie) {
        mag.attackEnemy(zombie);
        return zombie.getHealth() / 2;
    }
}
