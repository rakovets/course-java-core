package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Zombie extends Enemy {
    private boolean resurrection = true;
    public Zombie(String name) {
        super(name);
        setHealth(30);
        setDefaultDamage(15);
        setComboDamage(getDefaultDamage() * 3);
    }

    @Override
    public void takeDamage(int damage) {
        if(isAlive()) {
            setHealth(getHealth() - damage);
        } else if (resurrection) {
            resurrection = false;
            setHealth(20);
        }
    }

    public String attackHero(Hero hero) {
        if(!hero.isAlive()) {
            return "The " + hero.getName() + " is already dead.";
        } else if(hero.getHealth() < getComboDamage()) {
            hero.takeDamage(getComboDamage());
        } else {
            hero.takeDamage(getDefaultDamage());
        }
        return "The " + getName() + " attacks the " + hero.getName();
    }
}
