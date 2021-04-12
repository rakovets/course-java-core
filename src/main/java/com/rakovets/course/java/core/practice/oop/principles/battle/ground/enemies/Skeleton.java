package com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies;

import com.rakovets.course.java.core.practice.oop.principles.battle.ground.heroes.Hero;

public class Skeleton extends Enemy {

    public Skeleton(String name, int health) {
        super(name, health);
    }

    public void attackHero(Hero hero) {
        attackTemplate();
        hero.takeDamage(10);
    }

    public void attackTemplate() {
        System.out.println("---" + getName() + " атакует героя---");
    }

    public void startBattleMessage() {
        System.out.println("---Вы отправились на кладбище и встретили скелета---\n---Битва началась!---");
    }
}
