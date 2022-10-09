package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Vampire;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Witch;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Zombie;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Archer;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Mag;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Warrior;

public class BattleGroundDemo {
    public static void main(String[] args) {

        Archer archer = new Archer("Nick", 50);
        Mag mag = new Mag("Mike", 70);
        Warrior warrior = new Warrior("Win", 100);
        Zombie zombie = new Zombie(50, true);
        Witch witch = new Witch(200, true);
        Vampire vampire = new Vampire(500, true);

        archer.attackEnemy(zombie);
        System.out.println("Health zombie after attack Archer " + zombie.getHealth());
        zombie.doubleDamage(archer);
        System.out.println(archer.getHealth());
        archer.healing(zombie);
        System.out.println(zombie.getHealth());
        zombie.attackHero(archer);
        System.out.println("Health Archer after attack Zombie " + archer.getHealth());

        mag.attackEnemy(witch);
        System.out.println("Health witch after attack Mag " + witch.getHealth());
        mag.doubleDamage(witch);
        System.out.println(witch.getHealth());
        witch.attackHero(mag);
        System.out.println("Health Mag after attack Witch " + mag.getHealth());
        witch.resurrectionAfterDeath();
        System.out.println(witch.getHealth());

        warrior.attackEnemy(vampire);
        System.out.println("Health vampire after attack Warrior " + vampire.getHealth());
        warrior.deathPunch(vampire);
        System.out.println(vampire.getHealth());
        vampire.takeHealth(warrior);
        System.out.println(warrior.getHealth());
        vampire.attackHero(warrior);
        System.out.println("Health Warrior after attack Vampire " + warrior.getHealth());
    }
}
