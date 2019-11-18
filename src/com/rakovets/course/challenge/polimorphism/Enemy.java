package com.rakovets.course.challenge.polimorphism;

public class Enemy implements Mortal {
    private String name;
    private int health;
    private final int damageForBack = 1;

    Enemy(String name, int health){
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public int takeDamage(int damage){
        this.health = this.health - damage;
        System.out.printf("%s's health is: " + this.health + "\n", name);
        if (this.health <= 0){
            System.out.printf("%s is DEAD \n", name);
        }
        return this.health;
    }

    public boolean isAlive(){
        return this.health > 0;
    }

    public int backDamage(Hero hero){
        System.out.printf("%s is back damage to %s, damage is: " + damageForBack + " \n", getName(), hero.getName());
        return hero.takeDamage(damageForBack);
    }
}
