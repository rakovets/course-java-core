package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Zombie extends Enemy {

    public Zombie() {
        super(TypeEnemy.ZOMBIE);
    }

    public Zombie(int health) {
        super(health, TypeEnemy.ZOMBIE);
    }

    @Override
    public void attackHero(Hero hero) {
        if (hero.getTypeHero() == TypeHero.MAG) {
            hero.takeDamage(5);
        } else {
            hero.takeDamage(10);
        }
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if (damage <= 5 && !isAlive()) {
            setHealth(50);
        }
    }
}
