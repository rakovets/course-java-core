package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.*;

public class BattleGroundApplication {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(250, 250);
        Vampire vampire = new Vampire(400, 100);
        Titan titan = new Titan(500, 50);
        Warrior warrior = new Warrior("Semen", 400, 100);
        Archer archer = new Archer("Lisa", 300, 200);
        Mag mag = new Mag("Kate", 300, 300);

        warrior.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        warrior.attackEnemy(zombie);
        archer.attackEnemy(vampire);
        System.out.println(vampire.getHealth());
        vampire.attackHero(warrior);
        System.out.println(vampire.getHealth());
        titan.attackHero(warrior);
        System.out.println(warrior.getHealth());
        warrior.attackEnemy(titan);
        System.out.println(titan.getHealth());
        warrior.attackEnemy(vampire);
        System.out.println(vampire.getHealth());
        titan.attackHero(mag);
        mag.healing(warrior);
        System.out.println(warrior.getHealth());
        vampire.attackHero(archer);
        System.out.println(archer.getHealth());
    }
}
