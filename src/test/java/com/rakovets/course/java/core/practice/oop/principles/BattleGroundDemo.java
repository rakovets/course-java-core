package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.BattleGround.Enemies.Brigant;
import com.rakovets.course.java.core.practice.oop.principles.BattleGround.Enemies.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.BattleGround.Enemies.Zombie;
import com.rakovets.course.java.core.practice.oop.principles.BattleGround.Heroes.Archer;
import com.rakovets.course.java.core.practice.oop.principles.BattleGround.Heroes.Hero;
import com.rakovets.course.java.core.practice.oop.principles.BattleGround.Heroes.Mag;
import com.rakovets.course.java.core.practice.oop.principles.BattleGround.Heroes.Warrior;

public class BattleGroundDemo {
    public static void main(String[] args) {
        Hero hero = new Mag("MAG", 100);
        Enemy enemy = new Brigant(100);
        System.out.printf("Hero health - %s\n", hero.getHealthPoints());
        System.out.printf("Enemy health - %s\n", enemy.getHealth());
        hero.attackEnemy(enemy);
        System.out.printf("Enemy's health after attack of Mag - %s\n", enemy.getHealth());
        enemy.attackEnemy(hero);
        System.out.printf("Hero health after Enemy attack - %s\n", hero.getHealthPoints());
        enemy.isAlive();
        hero.death();
        hero.uniqueSkill(enemy);
        System.out.printf("Enemy health after Mag uses unique skill - %s\n", enemy.getHealth());
        enemy.isAlive();
        System.out.println("---\n---\n---");


        Hero hero1 = new Warrior("WAR", 150);
        Enemy enemy1 = new Zombie(100);
        System.out.printf("Warrior health - %s\n", hero1.getHealthPoints());
        System.out.printf("Zombie health - %s\n", enemy1.getHealth());
        hero1.attackEnemy(enemy1);
        System.out.printf("Zombie health after attack of Warrior - %s\n", enemy1.getHealth());
        enemy1.attackEnemy(hero1);
        System.out.printf("Warrior health after Zombie attack - %s\n", hero1.getHealthPoints());
        enemy1.isAlive();
        hero1.death();
        enemy1.reincarnation();
        enemy1.isAlive();

    }
}
