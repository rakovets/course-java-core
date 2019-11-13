package com.rakovets.course.challenge.oop.polymorphism;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero = new Warrior("Volk", 100);
        Warrior warrior = new Warrior("Warior", 120);
        Mag mag = new Mag("Mag", 100);
        Archer archer = new Archer("Archer", 50);
        Enemy enemy = new Enemy("Skeleton", 70);
        Zombie zombie = new Zombie("Zombie", 40);
        Skeleton skeleton = new Skeleton("Skeleton", 90);
        warrior.attackEnemy(zombie);
        boolean InDeath = hero.InDeath();
        System.out.println(InDeath);
        hero.attackEnemy(enemy);
        boolean isAliv1 = enemy.isAlive();
        System.out.println(isAliv1);
        mag.attackEnemy(enemy);
        boolean isAliv2 = enemy.isAlive();
        System.out.println(isAliv2);
        archer.attackEnemy(enemy);
        boolean is = enemy.isAlive();
        System.out.println(is);
        skeleton.attackHero(mag);
        boolean is1 = mag.isAlive();
        System.out.println(is1);
        zombie.attackHero(archer);
        boolean is2 = archer.isAlive();
        System.out.println(is2);
        enemy.attackHero(warrior);
        boolean is3 = warrior.isAlive();
        System.out.println(is3);
        skeleton.attackHero(mag);
        boolean is4 = mag.isAlive();
        System.out.println(is4);

    }
}
