package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Zombie extends Enemy {

    public Zombie() {
        super(TypeEnemy.ZOMBIE);
        this.damage = 5;
    }

    public Zombie(int health) {
        super(health, TypeEnemy.ZOMBIE);
        this.damage = 5;
    }

    @Override
    public void attackHero(Hero hero) {
        if (hero.getTypeHero() == TypeHero.MAG) {
            hero.takeDamage(damage);
        } else {
            hero.takeDamage(damage * 2);
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
