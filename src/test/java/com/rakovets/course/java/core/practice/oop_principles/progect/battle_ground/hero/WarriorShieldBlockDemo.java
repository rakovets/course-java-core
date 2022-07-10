package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Vampire;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Werewolf;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Zombie;

public class WarriorShieldBlockDemo {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("", 100, 0);
        Vampire vampire = new Vampire(100, 20);

        System.out.print("-------------------------------------------------------------------------------------------");
        System.out.println("\nThe vampire attacks the warrior.");
        System.out.println(warrior.getHealthHero());
        vampire.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        vampire.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        vampire.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        vampire.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        vampire.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        vampire.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        vampire.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        System.out.print("-------------------------------------------------------------------------------------------");

        Werewolf werewolf = new Werewolf(100, 20, 0);

        warrior.setHealthHero(100);

        System.out.println("\nThe werewolf in its first form attacks the warrior.");
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        System.out.print("-------------------------------------------------------------------------------------------");

        werewolf.setTime(3);
        warrior.setHealthHero(100);

        System.out.println("\nThe werewolf in the second form attacks the warrior.");
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        werewolf.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        System.out.print("-------------------------------------------------------------------------------------------");

        Zombie zombie = new Zombie(100, 20);

        warrior.setHealthHero(100);

        System.out.println("\nZombie attacks the warrior.");
        System.out.println(warrior.getHealthHero());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        zombie.attackHero(warrior);
        System.out.println(warrior.getHealthHero());
        System.out.print("-------------------------------------------------------------------------------------------");
    }
}
