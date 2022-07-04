package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public String attackEnemy() {
        return "The 'Archer' attacks";
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (getHealth() > 60) {
            enemy.takeDamage(40);
        } else {
            enemy.takeDamage(10);
        }
    }
}
