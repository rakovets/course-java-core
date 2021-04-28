package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.battle.ground.Dungeons;
import com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.battle.ground.heroes.*;

import java.util.Scanner;

public class BattleDemo {
    public static void main(String[] args) {
        BattleDemo battleDemo = new BattleDemo();
        SelectHeroClass selectHeroClass = new SelectHeroClass();
        Scanner cin = new Scanner(System.in);
        Dungeons dungeons = new Dungeons();
        int choice;
        Object hero;
        Object enemy;
        String name;

        System.out.println("---В этой игре нет баланса и продуманной боевой системы. " +
                "Все реализованное здесь - всего лишь демка.---");
        System.out.println("---Введите имя---\n");
        name = cin.nextLine();
        System.out.println("---Выберите класс героя---\n1.Воин 2.Лучник 3.Маг\n");
        choice = cin.nextInt();
        hero = selectHeroClass.selectClass(choice, name);
        System.out.println("Куда отправимся ?\n");
        dungeons.dungeonList();
        choice = cin.nextInt();
        try {
            enemy = dungeons.selectDungeon(choice);
            battleDemo.battleProcess((Hero) hero, (Enemy) enemy);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void battleProcess (Hero hero, Enemy enemy){
        int choice;
        Scanner cin = new Scanner(System.in);
        enemy.startBattleMessage();
        while (hero.getHealth() > 0 && enemy.getHealth() > 0) {
            System.out.printf("HP %s: %s\n", hero.getName(), hero.getHealth());
            System.out.printf("HP %s: %s\n\n", enemy.getName(), enemy.getHealth());
                hero.skillList();
                System.out.println("\n");
                choice = cin.nextInt();
                if (choice == 5) {
                    hero.skillDescription();
                } else if (choice == 1) {
                    hero.attackEnemy(enemy);
                } else if (choice == 2) {
                    hero.firstSkill(enemy);
                } else if (choice == 3) {
                    hero.secondSkill(enemy);
                } else if (choice == 4) {
                    if (hero.defendSkill(enemy)) {
                        System.out.println("---" + enemy.getName() + " промахнулся---");
                    } else {
                        enemy.attackHero(hero);
                    }
                } else {
                    System.out.println("Неверный ввод");
                }
                if (choice != 4) {
                    enemy.attackHero(hero);
                }
        }
        if (hero.getHealth() <= 0 && (!enemy.isAlive())) {
            System.out.println("Герой и враг оба погибли\nGAME OVER");
        } else if (enemy.isAlive()) {
            hero.death();
        } else {
            System.out.println("Враг повержен");
        }
    }
}
