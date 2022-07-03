package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class BattleGroundApplication {
    public static void main(String[] args) {
        Archer archer = new Archer("Hunt", 100);
        Mag mag = new Mag("Wiz", 100);
        Warrior warrior = new Warrior("Pal", 100);
        Zombie zombie = new Zombie(100);
        HighOrc highOrc = new HighOrc(100);
        Poring poring = new Poring(100);

        archer.attackEnemy(zombie, 50);
        System.out.println("Zombie health after archer attack: " + zombie.getHealth());

        zombie.attackHero(archer, 25);
        System.out.println("Archer " + archer.getName() + " health after zombie attack: " + archer.getHealth());

        mag.attackEnemy(zombie, 50);
        System.out.println("Zombie died and resurrected, health:" + zombie.getHealth());

        mag.heal();
        System.out.println("Mag health after heal: " + mag.getHealth());

        warrior.attackEnemy(highOrc, 50);
        System.out.println("High orc had first hit immunity, health:" + highOrc.getHealth());

        highOrc.attackHero(warrior, 150);
        System.out.println("Warrior reduces damage, health: " + warrior.getHealth());

        warrior.attackEnemy(zombie, 150);
        System.out.println("Zombie health: " + zombie.getHealth() + "\nZombie is alive: " + zombie.isAlive());

        zombie.attackHero(warrior, 25);
        System.out.println("Zombie died and can't attack, warrior health didn't change: " + warrior.getHealth());
    }
}
