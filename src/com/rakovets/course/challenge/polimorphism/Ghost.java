package com.rakovets.course.challenge.polimorphism;

public class Ghost extends Enemy {
    private int health;
    private final int damageForBack = 3;
    private String name;

    Ghost(String name, int health) {
        super(name, health);
    }

    public int backDamage(Hero hero){
        System.out.printf("%s is back damage to %s, the damage is: " + damageForBack + " \n", getName(), hero.getName());
        return hero.takeDamage(damageForBack);
    }
}
