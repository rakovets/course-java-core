package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Demo_Battle_Ground {
    public static void main(String[] args) {
        Enemy enemyPuzirik = new EnemyPuzirik("EnemyPuzirik");
        Enemy zombie = new Zombie("Zombie");
        Hero mag = new Mag("Mag");
        Hero warrior = new Warrior("Warrior");
        Hero archer = new Archer("Archer");

        System.out.println(enemyPuzirik.getHealth());
        enemyPuzirik.setHealth(110);
        System.out.println("SetHealth: " + enemyPuzirik.getHealth());
        System.out.println(enemyPuzirik.getHealth());
        System.out.println(warrior.attackEnemy(enemyPuzirik));

        System.out.println("Warrior health " + warrior.getHealth());
        System.out.println("Mag health " + mag.getHealth());
        System.out.println("Archer health " + archer.getHealth());

        System.out.println("GetHealth Puzirik " + enemyPuzirik.getHealth());
        System.out.println(mag.attackEnemy(enemyPuzirik));
        System.out.println("GetHealth Puzirik " + enemyPuzirik.getHealth());
        System.out.println(archer.attackEnemy(enemyPuzirik));
        System.out.println(enemyPuzirik.isAlive());
        System.out.println(warrior.isAlive());
        System.out.println("GetHealth Puzirik " + enemyPuzirik.getHealth());

        System.out.println("GetHealth warrior " + warrior.getHealth());
        System.out.println(enemyPuzirik.attackHero(warrior));
        System.out.println("GetHealth warrior " + warrior.getHealth());
        System.out.println(enemyPuzirik.getHealth());
        System.out.println();
        System.out.println("GetHealth archer " + archer.getHealth());
        System.out.println(enemyPuzirik.attackHero(archer));
        System.out.println("GetHealth archer " + archer.getHealth());
        System.out.println();
        System.out.println("GetHealth Mag " + mag.getHealth());
        System.out.println(enemyPuzirik.attackHero(mag));
        System.out.println("GetHealth Mag " + mag.getHealth());
        System.out.println();
        System.out.println("GetHealth archer " + archer.getHealth());
        System.out.println("GetHealth warrior " + warrior.getHealth());
        System.out.println(enemyPuzirik.attackHero(archer));
        System.out.println("GetHealth warrior " + warrior.getHealth());
        System.out.println("GetHealth archer " + archer.getHealth());
        System.out.println(enemyPuzirik.attackHero(archer));
        System.out.println("GetHealth archer " + archer.getHealth());
        System.out.println();
        System.out.println("Check Zombie");
        System.out.println("GetHealth Zombie " + zombie.getHealth());
        System.out.println(archer.attackEnemy(zombie));
        System.out.println(zombie.isAlive());
        System.out.println("GetHealth Zombie " + zombie.getHealth());
        System.out.println(archer.attackEnemy(zombie));
        System.out.println(zombie.isAlive());
        System.out.println("GetHealth Zombie " + zombie.getHealth());
        System.out.println(archer.attackEnemy(zombie));
        System.out.println(zombie.isAlive());
        System.out.println("GetHealth Zombie " + zombie.getHealth());
        System.out.println(archer.attackEnemy(zombie));
        System.out.println(zombie.isAlive());
        System.out.println("GetHealth Zombie " + zombie.getHealth());
        System.out.println();
        System.out.println(warrior.attackEnemy(zombie));
        System.out.println("GetHealth Zombie " + zombie.getHealth());
    }
}
