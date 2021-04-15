package com.rakovets.course.java.core.practice.oop.principles.project.battle.ground;

public class Mag extends Hero {
    private final int damage = 30;

    public Mag(String name, int healthPoint) {
        super(name, healthPoint);
    }

    @Override
    public int getHealthPoint() {
        return super.getHealthPoint();
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print("Mag " + getName() + " attack enemy!\n");
        enemy.takeDamage(damage);
    }

    @Override
    public void skill(Ghost ghost, Zombie zombie) {
        System.out.println("Damage to everyone");
        ghost.massiveDamage(damage);
        zombie.massiveDamage(damage);
    }
}
