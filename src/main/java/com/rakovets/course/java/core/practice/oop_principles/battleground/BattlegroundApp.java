package com.rakovets.course.java.core.practice.oop_principles.battleground;

public class BattlegroundApp {
    public static void main(String[] args) {

        Archer archer = new Archer("archer", 20, true);
        Mag mag = new Mag("mag", 50, true);
        Warrior warrior = new Warrior("warrior", 100, true);
        Zombie zombie = new Zombie(50, true);
        Ghoul ghoul = new Ghoul(1000, true);
        Skeleton skeleton = new Skeleton(500, true);

        archer.attackEnemy(zombie);
        System.out.println(zombie.isAlive());
        System.out.println(zombie.getHealth());

        archer.attackEnemy(zombie);
        System.out.println(zombie.isAlive());
        System.out.println(zombie.getHealth());

        zombie.resurrection();
        System.out.println(zombie.isAlive());
        System.out.println(zombie.getHealth());

        archer.lethalShot(zombie);
        System.out.println(zombie.isAlive());
        System.out.println(zombie.getHealth());

        mag.attackEnemy(ghoul);
        System.out.println(ghoul.getHealth());

        mag.battleHeal();
        System.out.println(mag.getHealth());

        warrior.attackEnemy(ghoul);
        System.out.println(ghoul.getHealth());

        warrior.doubleDamage(ghoul);
        System.out.println(ghoul.getHealth());

        ghoul.attackHero(warrior);
        System.out.println(warrior.isAlive());
        System.out.println(warrior.getHealth());

        ghoul.raiseUndead(warrior);
        System.out.println(warrior.isAlive());
        System.out.println(warrior.getHealth());

        skeleton.attackHero(warrior);
        System.out.println(warrior.isAlive());
        System.out.println(warrior.getHealth());

        skeleton.absorbHealth(warrior);
        System.out.println(warrior.isAlive());
        System.out.println(warrior.getHealth());
        System.out.println(skeleton.getHealth());

        ghoul.attackHero(archer);
        System.out.println(archer.isAlive());
        System.out.println(archer.getHealth());
    }
}
