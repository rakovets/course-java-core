package com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies;

import com.rakovets.course.java.core.practice.oop.principles.battle.ground.heroes.Hero;

public class Wolf extends Enemy{

    public Wolf(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        attackTemplate();
        hero.takeDamage(15);
    }

    @Override
    public void attackTemplate() {
        System.out.println("---" + getName() + " атакует героя---");
    }

    @Override
    public void startBattleMessage() {
        System.out.println("---Вы отправились в лес и встретили волка---\n---Битва началась!---");
    }
}
