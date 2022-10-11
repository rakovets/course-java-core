package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies.Demon;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies.Werewolf;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies.Zombie;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Archer;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Mag;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Warrior;

public class BattleGroundDemo {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Gingo", 300, 50);
        Mag wizard = new Mag("Herald", 250, 30);
        Archer archer = new Archer("Sam", 300, 5);
        Zombie zombie = new Zombie("Groat", 200, 2);
        Demon demon = new Demon("Baltazar", 400, 2);
        Werewolf werewolf = new Werewolf("Jakob", 250);

        System.out.println("Let's attack begin!");
        System.out.println(warrior.getName() + " " + warrior.attackEnemy(demon));
        System.out.println(demon.getName() + " health: " + demon.getHealth());
        System.out.println(demon.getName() + " " + demon.attackHero(warrior));
        System.out.println(warrior.getName() + " Hero health: " + warrior.getHealth());
        System.out.println("Hero armor: " + warrior.getArmor());
        System.out.println(wizard.getName() + " " + wizard.attackEnemy(zombie));
        System.out.println(zombie.getName() + " health: " + zombie.getHealth());
        System.out.println(zombie.getName() + " " + zombie.attackHero(wizard));
        System.out.println(wizard.getName() + " health: " + wizard.getHealth());
        System.out.println(archer.getName() + " " + archer.attackEnemy(werewolf));
        System.out.println(werewolf.getName() + " health: " + werewolf.getHealth());
        System.out.println(werewolf.getName() + " " + werewolf.attackHero(archer));
        System.out.println(archer.getName() + " health: " + archer.getHealth());
        System.out.println(warrior.getName() + " " + warrior.attackEnemy(werewolf));
        System.out.println(werewolf.getName() + " health: " + werewolf.getHealth());
        System.out.println(werewolf.getName() + " " + werewolf.clawedHit(warrior));
        System.out.println(warrior.getName() + " health: " + warrior.getHealth());
        System.out.println("Hero armor: " + warrior.getArmor());
        System.out.println(wizard.getName() + " " + wizard.attackEnemy(demon));
        System.out.println(demon.getName() + " health: " + demon.getHealth());
        System.out.println(demon.getName() + " " + demon.attackWithHellfire(wizard));
        System.out.println(wizard.getName() + " health: " + wizard.getHealth());
        wizard.makeHealingSpell();
        wizard.makeHealingSpell(warrior);
        System.out.println(wizard.getName() + " health after healing spell: " + wizard.getHealth());
        System.out.println(warrior.getName() + " health after healing spell: " + warrior.getHealth());
        System.out.println(wizard.getName() + " mana after healing spell: " + wizard.getMana());
        System.out.println(archer.getName() + " " + archer.fireArrowAttack(zombie));
        System.out.println(zombie.getName() + " health: " + zombie.getHealth());
    }
}
