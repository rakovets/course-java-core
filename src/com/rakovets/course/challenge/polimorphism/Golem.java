package com.rakovets.course.challenge.polimorphism;

public class Golem extends Enemy {
    private int health;
    private final int damageForBack = 4;
    private String name;

    Golem(String name, int health) {
        super(name, health);
    }

    public int backDamage(Hero hero){
        System.out.printf("%s is back damage to %s, the damage is: " + damageForBack + " \n", getName(), hero.getName());
        return hero.takeDamage(damageForBack);
    }

    public void doubleDamage(Hero hero){
        this.health = getHealth();
        if (this.health > 20){
            System.out.printf("%s's health must be < 5\n", getName());
        }else if (this.health <= 20 && this.health >0){
            System.out.printf("%s have double damage, damage is: " + damageForBack * 2 + "\n", getName());
            hero.takeDamage(damageForBack * 2);
        }else System.out.printf("%s is DEAD\n", getName());
    }

}
