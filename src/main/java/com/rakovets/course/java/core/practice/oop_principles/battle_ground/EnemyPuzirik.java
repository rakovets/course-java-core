package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class EnemyPuzirik extends Enemy {
    public EnemyPuzirik(String name) {
        super(name);
        setHealth(100);
        setDefaultDamage(20);
        setComboDamage(getDefaultDamage() * 2);
    }

    @Override
    public String attackHero(Hero hero) {
        if(!hero.isAlive()) {
            return "The " + hero.getName() + " is already dead.";
        } else if(hero.getHealth() < getComboDamage()) {
            hero.takeDamage(getComboDamage());
        } else {
            hero.takeDamage(getDefaultDamage());
        }

        if(hero.isAlive()) {
            setHealth(getHealth() + 5);
        } else {
            setHealth(getHealth() + 10);
        }
        return "The " + getName() + " attacks the " + hero.getName();
    }
}
