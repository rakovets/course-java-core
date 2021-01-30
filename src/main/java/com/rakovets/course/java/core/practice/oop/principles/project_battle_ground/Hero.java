package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

public abstract class Hero implements Mortal{
    private final String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        } else {
            this.health = 0;
        }
    }

    public String getHeroName() {
        return name;
    }

    public int getHealth() {
        return this.health;
    }

    public boolean isAlive(){
        return this.health > 0;
    }

    public void takeDamage(int damage) {
        this.health = (damage > this.health) ? 0 : this.health - damage;
    }

    public abstract String attackEnemy(Enemy enemy);
}
