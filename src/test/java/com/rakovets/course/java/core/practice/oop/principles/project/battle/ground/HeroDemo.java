package com.rakovets.course.java.core.practice.oop.principles.project.battle.ground;

public class HeroDemo {
    public static void main(String[] args) {
        Archer archer = new Archer("Sylvanas", 120);
        Mag mag = new Mag("Anduin", 10);
        Warrior warrior = new Warrior("Varian", 150);
        Zombie zombie = new Zombie(100);
        Ghost ghost = new Ghost(100);


        System.out.printf("%s\n", archer.getName());
        archer.attackEnemy(zombie);
        System.out.printf("%d\n", zombie.getHealth());
        System.out.printf("%s\n", mag.getName());
        mag.attackEnemy(zombie);
        System.out.printf("%d\n", zombie.getHealth());
        System.out.printf("%s\n", warrior.getName());
        warrior.attackEnemy(zombie);
        System.out.printf("%d\n", zombie.getHealth());
        zombie.setHealth(100);
        System.out.printf("%d\n", zombie.getHealth());
        System.out.printf("%b\n", zombie.isAlive());

        zombie.attackHero(archer);
        archer.getHealthPoint();
        zombie.attackHero(warrior);
        warrior.getHealthPoint();
        zombie.attackHero(mag);
        mag.getHealthPoint();

        warrior.attackEnemy(zombie);
        archer.attackEnemy(ghost);

        ghost.setHealth(100);
        archer.skill(ghost);
        System.out.printf("%d", ghost.getHealth());

        ghost.setHealth(100);
        warrior.skill(ghost);
        System.out.printf("%d", ghost.getHealth());

        ghost.setHealth(100);
        zombie.setHealth(100);
        mag.skill(zombie, ghost);
        System.out.printf("\n%d %d", ghost.getHealth(), zombie.getHealth());
    }
}
