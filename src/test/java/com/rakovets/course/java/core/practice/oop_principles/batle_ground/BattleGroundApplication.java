package com.rakovets.course.java.core.practice.oop_principles.batle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.*;

public class BattleGroundApplication {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Warrior", 100);
        Archer archer = new Archer("Archer", 120);
        Mag mag = new Mag("Mag", 110);
        Witch witch = new Witch();
        Troll troll = new Troll();

        System.out.println(warrior.getName() + " " + warrior.getHealth());
        System.out.println(archer.getName() + " " + archer.getHealth());
        System.out.println(mag.getName() + " " + mag.getHealth());
        System.out.println("witch " + witch.getHealth());
        System.out.println("troll " + troll.getHealth());
        System.out.println();
        System.out.println(warrior.attackEnemy(witch) + " witch");
        System.out.println(mag.attackEnemy(troll) + " troll");
        System.out.println(archer.attackEnemy(troll) + " troll");
        System.out.println(troll.attackHero(warrior) + " " + warrior.getName());
        System.out.println(witch.attackHero(mag) + " " + mag.getName());
        System.out.println();
        System.out.println(mag.getHealth() + " " + mag.heal(mag));
        System.out.println(warrior.getHealth() + " " + mag.heal(warrior));
        System.out.println();
        warrior.attackEnemy(witch);
        warrior.attackEnemy(witch);
        warrior.attackEnemy(witch);
        warrior.attackEnemy(witch);
        System.out.println(witch.getHealth());
        System.out.println(witch.revive(witch));
    }
}
