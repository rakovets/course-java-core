package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Archer;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Mag;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Warrior;

public class ZombieResurrectionDemo {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(100, 0);
        Archer archer = new Archer("", 100, 0);

        archer.setDamageHero(100);

        System.out.print("-------------------------------------------------------------------------------------------");
        System.out.println("\nThe archer attacks the zombies.");
        System.out.println(zombie.getHealthEnemy());
        archer.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        archer.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        archer.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        archer.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        System.out.print("-------------------------------------------------------------------------------------------");

        zombie.setHealthEnemy(100);
        archer.setDamageHero(50);

        System.out.println("\nThe archer attacks the zombies using an enhanced shot.");
        System.out.println(zombie.getHealthEnemy());
        archer.boostedShot();
        System.out.println(zombie.getHealthEnemy());
        archer.boostedShot();
        System.out.println(zombie.getHealthEnemy());
        archer.boostedShot();
        System.out.println(zombie.getHealthEnemy());
        archer.boostedShot();
        System.out.println(zombie.getHealthEnemy());
        System.out.print("-------------------------------------------------------------------------------------------");

        Mag mag = new Mag("", 0, 0);

        mag.setDamageHero(100);
        zombie.setHealthEnemy(100);

        System.out.println("\nThe magician attacks the zombies.");
        System.out.println(zombie.getHealthEnemy());
        mag.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        mag.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        mag.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        mag.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        mag.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        mag.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        System.out.print("-------------------------------------------------------------------------------------------");

        Warrior warrior = new Warrior("", 0, 0);

        warrior.setDamageHero(100);
        zombie.setHealthEnemy(100);

        System.out.println("\nWarrior attacks zombies.");
        System.out.println(zombie.getHealthEnemy());
        warrior.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        warrior.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        warrior.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        warrior.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        warrior.attackEnemy(zombie);
        System.out.println(zombie.getHealthEnemy());
        System.out.print("-------------------------------------------------------------------------------------------");
    }
}
