package com.rakovets.course.challenge.polimorphism;

public abstract class Hero implements Mortal{
    private String name;
    private int health;

    Hero(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public boolean isAlive(){
        return this.health > 0;
    }

    public int takeDamage(int damage){
        this.health = this.health - damage;
        System.out.printf("%s's health is: " + this.health + "\n", name);
        if (this.health <= 0){
            System.out.printf("%s is DEAD \n", name);
        }
        return this.health;
    }
}