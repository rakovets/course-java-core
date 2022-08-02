package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Demo_Battle_Ground {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(100);
        Hero mag = new Mag("Mag");
        Hero warrior = new Warrior("Warrior");
        Hero archer = new Archer("Archer");

        System.out.println(enemy.getHealth());
        enemy.setHealth(110);
        System.out.println("SetHealth: " + enemy.getHealth());
        System.out.println(enemy.getHealth());
        System.out.println(warrior.attackEnemy(enemy));
        System.out.println(enemy.getHealth());

        System.out.println("Warrior health " + warrior.getHealth());
        System.out.println("Mag health " + mag.getHealth());
        System.out.println("Archer health " + archer.getHealth());

        System.out.println(enemy.getHealth());
        System.out.println(mag.attackEnemy(enemy));
        System.out.println(enemy.getHealth());
        System.out.println(archer.attackEnemy(enemy));
        System.out.println(enemy.getHealth());

    }
}
