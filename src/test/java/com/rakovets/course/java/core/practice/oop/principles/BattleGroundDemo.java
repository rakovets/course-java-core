package com.rakovets.course.java.core.practice.oop.principles;

public class BattleGroundDemo {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(100);
        Warrior warrior = new Warrior("Alex", 100);
        Mag mag = new Mag("Valera", 80);
        Archer archer = new Archer("Ura", 90);

     /*   while (warrior.isAlive() && zombie.isAlive()) {
            warrior.attackEnemy(zombie);
            System.out.println(zombie.getHealth());
            zombie.attackEnemy(warrior);
            System.out.println(warrior.getHealth());
        }*/

        zombie.setHealth(100);

        while (mag.isAlive() && zombie.isAlive()) {
            zombie.posion(mag);
            mag.blizzard(zombie);
            mag.attackEnemy(zombie);
            System.out.println(zombie.getHealth());
            zombie.attackEnemy(mag);
            System.out.println(mag.getHealth());
        }

    }
}
