package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Archer;

public class ZombieResurrectionTest {
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
    }
}
