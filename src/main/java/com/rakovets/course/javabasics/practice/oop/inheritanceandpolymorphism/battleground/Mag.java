package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Mag extends Hero {
    public static final String ANSI_YELLOW = "\u001B[33m";
    private int damage = 66;
    Mag(String name){
        super(name);
    }

    @Override
    public String attackEnemy(){
       Enemy unit = new Enemy(40);
        return "Warrior " + super.getName() + " is starting attack enemy units!!!\n" + ANSI_RED + "Enemy got damages = " + unit.takeDamage(damage) + ANSI_RESET;
    }
}
