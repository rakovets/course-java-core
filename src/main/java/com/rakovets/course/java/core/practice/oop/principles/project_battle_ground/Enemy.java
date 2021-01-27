package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

abstract class Enemy implements Mortal{
    private int health;

    public Enemy(int health) {
        if (health > 0 && health <= 100) {
            this.health = health;
        } else {
            System.out.println("Health is out of bounds, please set health in 1 - 100");
        }
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public boolean isAlive(){
        return this.health > 0;
    }

    abstract public String attackHero(Hero hero);

}
