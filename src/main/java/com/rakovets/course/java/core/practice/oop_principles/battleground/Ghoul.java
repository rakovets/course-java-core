package com.rakovets.course.java.core.practice.oop_principles.battleground;

public class Ghoul extends Enemy {
    public Ghoul (int health, boolean isAlive) {
        super(health, isAlive);
    }

    @Override
    public void attackHero(Hero hero) {
        final int GHOUL_DAMAGE = 20;
        hero.takeDamage(GHOUL_DAMAGE);
    }

    public void raiseUndead(Hero hero) {
        Zombie z = new Zombie(100, true);
        Skeleton s = new Skeleton(100, true);
        z.attackHero(hero);
        s.attackHero(hero);
    }
}
