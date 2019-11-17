package com.rakovets.course.challenge.polimorphism;

public class Zombie extends Enemy {
    private int health;
    private final int damageForBack = 2;
    private final int resurrectionHealth = 15;

    Zombie(String name, int health){
        super(name, health);
    }

    public int backDamage(Hero hero){
        System.out.printf("%s is back damage to %s, the damage is: " + damageForBack + " \n", getName(), hero.getName());
        return hero.takeDamage(damageForBack);
    }

    public void resurrection(){
        if(isAlive() == false) {
            this.health = resurrectionHealth;
            System.out.printf("It's a miracle, %s is resurrection, %s's health is: " + this.health + "\n", getName(), getName());
            setHealth(this.health);
        }else {
            System.out.printf("No resurrection %s is alive\n", getName());
        }
    }
}
