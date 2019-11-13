package com.rakovets.course.challenge.polimorphism;

public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Wari");
        Enemy unWarrior = new Enemy(100);
        warrior.attackEnemy(unWarrior);
        System.out.println("enemy unWarrior health is: " + unWarrior.getHealth());
    }
}
