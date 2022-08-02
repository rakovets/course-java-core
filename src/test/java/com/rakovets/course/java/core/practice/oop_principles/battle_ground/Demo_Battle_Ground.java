package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Demo_Battle_Ground {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(100);
        System.out.println(enemy.getHealth());
        enemy.setHealth(110);
        System.out.println("SetHealth: " + enemy.getHealth());
        Hero hero = new Hero("Hero");
        System.out.println(hero.attackEnemy(enemy));
        System.out.println(enemy.getHealth());
        Hero warrior = new Warrior("Warrior");
        System.out.println(warrior.attackEnemy(enemy));
        System.out.println(enemy.getHealth());
        Hero mag = new Mag("Mag");
        System.out.println(mag.attackEnemy(enemy));
        System.out.println(enemy.getHealth());
        Hero archer = new Archer("Archer");
        System.out.println(archer.attackEnemy(enemy));
        System.out.println(enemy.getHealth());

    }
}
