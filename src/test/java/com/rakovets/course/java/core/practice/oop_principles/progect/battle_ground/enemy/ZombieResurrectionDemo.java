package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Archer;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Mag;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Warrior;

public class ZombieResurrectionDemo {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(100);
        Archer archer = new Archer("", 100);

        archer.setDamageArcher(100);

        System.out.println(zombie.getHealth());
        archer.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        archer.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        archer.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        archer.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        System.out.println("-----------------------------------------------------------------------------------------");

        zombie.setHealth(100);
        archer.setBoostShot(100);

        System.out.println(zombie.getHealth());
        archer.boostedShot(zombie);
        System.out.println(zombie.getHealth());
        archer.boostedShot(zombie);
        System.out.println(zombie.getHealth());
        archer.boostedShot(zombie);
        System.out.println(zombie.getHealth());
        archer.boostedShot(zombie);
        System.out.println(zombie.getHealth());
        System.out.println("-----------------------------------------------------------------------------------------");

        Mag mag = new Mag("", 0);

        mag.setDamageMag(100);
        zombie.setHealth(100);

        System.out.println(zombie.getHealth());
        mag.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        mag.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        mag.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        mag.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        mag.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        mag.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        System.out.println("-----------------------------------------------------------------------------------------");

        Warrior warrior = new Warrior("", 0);

        warrior.setDamageWarrior(100);
        zombie.setHealth(100);

        System.out.println(zombie.getHealth());
        warrior.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        warrior.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        warrior.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        warrior.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        warrior.attackEnemy(zombie);
        System.out.println(zombie.getHealth());
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
