package com.rakovets.course.challenge.solution2;

public class TrainingGround {
    public static void main(String[] args) {
        Archer bob = new Archer("Bob");
        Mag lexa = new Mag("Lexa");
        Warrior pasha = new Warrior("Pasha");
        Enemy gosha = new Enemy(100);
        System.out.println(bob.getName());
        System.out.println(lexa.getName());
        System.out.println(pasha.getName());
        bob.attackEnemy(gosha);
        lexa.attackEnemy(gosha);
        pasha.attackEnemy(gosha);
    }
}
