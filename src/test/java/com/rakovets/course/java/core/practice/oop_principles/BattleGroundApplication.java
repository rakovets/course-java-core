package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.*;

public class BattleGroundApplication {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(250);
        Vampire vampire = new Vampire(400);
        Titan titan = new Titan(500);
        Warrior warrior = new Warrior("Semen", 400);
        Archer archer = new Archer("Lisa", 300);
        Mag mag = new Mag("Kate", 300);

        warrior.attackEnemy(zombie, 250);
        System.out.println(zombie.getHealth());
        warrior.attackEnemy(zombie, 100);

        archer.attackEnemy(vampire, 50);
        System.out.println(vampire.getHealth());
        vampire.attackHero(warrior,150);
        System.out.println(vampire.getHealth());
        titan.attackHero(warrior, 150);
        System.out.println(warrior.getHealth());
        warrior.attackEnemy(titan, 150);
        System.out.println(titan.getHealth());
        warrior.attackEnemy(vampire, 100);
        System.out.println(vampire.getHealth());
        titan.attackHero(mag, 100);
        mag.healing(warrior, 100);
        System.out.println(warrior.getHealth());
        vampire.attackHero(archer, 100);
        System.out.println(archer.getHealth());
    }
}
