package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

class Mag extends Hero {
    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public String attackEnemy() {
        return "The 'Mag' attacks";
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (enemy instanceof Zombie) {
            enemy.takeDamage(50);
        } else {
            enemy.takeDamage(5);
        }
    }
}
