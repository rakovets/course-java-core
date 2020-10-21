package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Zoomby extends Enemy{
    public Zoomby(int health) {
        super(health);
    }
    int damage = 30;
    boolean revive = true;

    public void setDamage(int damage){
        this.damage = damage;
    }
    @Override
    public void attackHero(Hero hero){
        hero.takeDamage(damage);
        System.out.println("Zoomby has attacked Hero and takes " + damage + " of Health" );
    }


}
