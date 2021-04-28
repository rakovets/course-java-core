package com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies;

import com.rakovets.course.java.core.practice.oop.principles.battle.ground.heroes.Hero;

public class Slug extends Enemy {
    public Slug(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        attackTemplate();
        hero.takeDamage(30);
    }

    @Override
    public void attackTemplate() {
        System.out.println("---" + getName() + " атакует героя---");
    }

    @Override
    public void startBattleMessage() {
        System.out.println("---Вы вышли в поле и встретили слизня---\n---Битва началась!---");
    }
}
