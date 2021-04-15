package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.Hero;
import com.rakovets.course.java.core.practice.oop.principles.Archer;
import com.rakovets.course.java.core.practice.oop.principles.Warrior;
import com.rakovets.course.java.core.practice.oop.principles.Mag;
import com.rakovets.course.java.core.practice.oop.principles.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.Dragon;
import com.rakovets.course.java.core.practice.oop.principles.Bandit;
import com.rakovets.course.java.core.practice.oop.principles.Mortal;

public class BattleDemo {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Albert", 1000);
        Archer archer = new Archer("Maksim", 1300);
        Bandit bandit = new Bandit(1000);
        System.out.printf("Hero health - %d\n", warrior.getHealth());
        System.out.printf("Hero health - %d\n", archer.getHealth());
        System.out.printf("Enemy health - %d\n", bandit.getHealthEnemy());

        warrior.attackEnemy(bandit);
        bandit.attackHero(warrior);
        archer.attackEnemy(bandit);
        bandit.attackHero(archer);
        warrior.swordAttackEnemy(bandit);
        bandit.axeAttackHero(warrior);
        archer.crossbowAttackEnemy(bandit);
        bandit.axeAttackHero(archer);
        System.out.printf("Hero health - %d\n", warrior.getHealth());
        System.out.printf("Hero health - %d\n", archer.getHealth());
        System.out.printf("Enemy health - %d\n", bandit.getHealthEnemy());
        warrior.isAlive();
        archer.isAlive();
        bandit.isAlive();

        Mag mag = new Mag("Ignat", 1500);
        Dragon dragon = new Dragon(2000);
        System.out.printf("Hero health - %d\n", mag.getHealth());
        System.out.printf("Enemy health - %d\n", dragon.getHealthEnemy());

        mag.attackEnemy(dragon);
        dragon.attackHero(mag);
        mag.telekinesisAttackEnemy(dragon);
        dragon.fireAttackHero(mag);
        System.out.printf("Hero health - %d\n", mag.getHealth());
        System.out.printf("Enemy health - %d\n", dragon.getHealthEnemy());
        mag.isAlive();
        dragon.isAlive();
    }
}
