package com.rakovets.course.challenge.polimorphism;

public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Warir",100);
        Enemy unWarrior = new Enemy("unWarrir", 100);
        warrior1.attackEnemy(unWarrior);
        System.out.println("enemy unWarrior health is: " + unWarrior.getHealth());


        //Task 7
        System.out.println("\n TASK7 START \n");
        System.out.println("FIRST BATTLE");
        Archer archer = new Archer("Arhcie",100);
        Zombie zombie = new Zombie("Zomb", 100);
        archer.attackEnemy(zombie);
        zombie.backDamage(archer);
        archer.attackEnemy(zombie);
        zombie.resurrection();
        archer.attackEnemy(zombie);
        zombie.backDamage(archer);
        archer.superPunch(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        zombie.resurrection();
        archer.attackEnemy(zombie);

        System.out.println("\nSECOND BATTLE\n");
        Warrior warrior = new Warrior("Warrik", 100);
        Golem golem = new Golem("Gol", 100);
        warrior.attackEnemy(golem);
        golem.backDamage(warrior);
        warrior.superWarriorPunch(golem);
        golem.doubleDamage(warrior);
        warrior.attackEnemy(golem);
        golem.doubleDamage(warrior);
        warrior.attackEnemy(golem);

        System.out.println("\nTHIRD BATTLE\n");
        Mag mag = new Mag("Merllin", 70);
        Archer archer1 = new Archer("Archie1",20);
        Ghost ghost = new Ghost("Casper", 50);
        mag.attackEnemy(ghost);
        ghost.backDamage(archer1);
        Golem golem1 = new Golem("Gol1",100);
        golem1.backDamage(archer1);
        Zombie zombie1 = new Zombie("Zomb1",100);
        zombie1.backDamage(archer1);
        mag.attackEnemy(ghost);
        archer1.attackEnemy(ghost);
        ghost.backDamage(archer1);
        golem1.backDamage(archer1);
        zombie1.backDamage(archer1);
        mag.attackEnemy(ghost);
        ghost.backDamage(archer1);
        mag.Emergency(archer1);


    }
}
