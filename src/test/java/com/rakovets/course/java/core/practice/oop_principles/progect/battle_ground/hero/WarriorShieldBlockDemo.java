package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Vampire;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Werewolf;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Zombie;

public class WarriorShieldBlockDemo {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("", 100);
        Vampire vampire = new Vampire(100);

        System.out.println(warrior.getHealth());
        vampire.attackHero(warrior);
        System.out.println(warrior.getHealth());
        vampire.attackHero(warrior);
        System.out.println(warrior.getHealth());
        vampire.attackHero(warrior);
        System.out.println(warrior.getHealth());
        vampire.attackHero(warrior);
        System.out.println(warrior.getHealth());
        vampire.attackHero(warrior);
        System.out.println(warrior.getHealth());
        System.out.println("-----------------------------------------------------------------------------------------");

        Werewolf werewolf = new Werewolf(100, 7);

        warrior.setHealth(100);

        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        System.out.println("-----------------------------------------------------------------------------------------");

        werewolf.setTime(3);
        warrior.setHealth(100);

        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealth());
        System.out.println("-----------------------------------------------------------------------------------------");

        Zombie zombie = new Zombie(100);

        warrior.setHealth(100);

        System.out.println(warrior.getHealth());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealth());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealth());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealth());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealth());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealth());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealth());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealth());
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
