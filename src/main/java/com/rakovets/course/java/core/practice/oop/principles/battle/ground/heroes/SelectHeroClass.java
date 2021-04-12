package com.rakovets.course.java.core.practice.oop.principles.battle.ground.heroes;

import com.rakovets.course.java.core.practice.oop.principles.battle.ground.Dungeons;
import com.rakovets.course.java.core.practice.oop.principles.battle.ground.enemies.Skeleton;
import com.rakovets.course.java.core.practice.oop.principles.battle.ground.heroes.Archer;
import com.rakovets.course.java.core.practice.oop.principles.battle.ground.heroes.Mag;
import com.rakovets.course.java.core.practice.oop.principles.battle.ground.heroes.Warrior;

import java.util.Scanner;

public class SelectHeroClass {
    private String inputName;
    private int inputChoice;

    Scanner cin = new Scanner(System.in);
    Dungeons dungeons = new Dungeons();
    Skeleton skeleton = new Skeleton("Скелет", 100);

    public SelectHeroClass(int inputChoice) {
        this.inputChoice = inputChoice;
    }

    public int inputChoice() {
        inputChoice = cin.nextInt();
        return inputChoice;
    }

    public String inputName() {
        System.out.println("Введите имя");
        inputName = cin.nextLine();
        return inputName;
    }

    public void selectWarrior() {
        inputName();
        Warrior warrior = new Warrior(inputName, 100);
        System.out.println("Куда отправимся ?");
        dungeons.dungeonList();
        inputChoice();
        if (inputChoice == 1) {
            skeleton.startBattleMessage();
            while (warrior.getHealth() > 0 && skeleton.getHealth() > 0) {
                System.out.printf("\nHP %s: %s\n", warrior.getName(), warrior.getHealth());
                System.out.printf("HP врага: %s\n\n", skeleton.getHealth());
                warrior.skillList();
                System.out.println("\n");
                inputChoice();

                if (inputChoice == 5) {
                    warrior.skillDescription();
                } else if (inputChoice == 1) {
                    warrior.attackEnemy(skeleton);
                    skeleton.attackHero(warrior);
                } else if (inputChoice == 2) {
                    warrior.warriorShield(skeleton);
                    skeleton.attackHero(warrior);
                } else if (inputChoice == 3) {
                    warrior.cleavingBlow(skeleton);
                    skeleton.attackHero(warrior);
                } else if (inputChoice == 4) {
                    if (warrior.defend(skeleton)) {
                        System.out.println("---" + skeleton.getName() + " промахнулся---");
                    } else {
                        skeleton.attackHero(warrior);
                    }
                } else {
                    System.out.println("Неверный ввод");
                }
            }
            if (warrior.getHealth() <= 0 && (!skeleton.isAlive())) {
                System.out.println("Герой и враг оба погибли\nGAME OVER");
            } else if (skeleton.isAlive()) {
                warrior.death();
            } else {
                System.out.println("Враг повержен");
            }
        }
        else {
            System.out.println("Неверный ввод");
        }
    }

    public void selectArcher() {
        inputName();
        Archer archer = new Archer(inputName, 100);
        System.out.println("Куда отправимся ?");
        dungeons.dungeonList();
        inputChoice();
        if (inputChoice == 1) {
            skeleton.startBattleMessage();
            while (archer.getHealth() > 0 && skeleton.getHealth() > 0) {
                System.out.printf("HP %s: %s\n", archer.getName(), archer.getHealth());
                System.out.printf("HP врага: %s\n\n", skeleton.getHealth());
                archer.skillList();
                System.out.println("\n");
                inputChoice();

                if (inputChoice == 5) {
                    archer.skillDescription();
                } else if (inputChoice == 1) {
                    archer.attackEnemy(skeleton);
                    skeleton.attackHero(archer);
                } else if (inputChoice == 2) {
                    archer.randomShot(skeleton);
                    skeleton.attackHero(archer);
                } else if (inputChoice == 3) {
                    archer.headShot(skeleton);
                    skeleton.attackHero(archer);
                } else if (inputChoice == 4) {
                    if (archer.defend(skeleton)) {
                        System.out.println("---" + skeleton.getName() + " промахнулся---");
                    } else {
                        skeleton.attackHero(archer);
                    }
                } else {
                    System.out.println("Неверный ввод");
                }
            }
            if (archer.getHealth() <= 0 && (!skeleton.isAlive())) {
                System.out.println("Герой и враг оба погибли\nGAME OVER");
            } else if (skeleton.isAlive()) {
                archer.death();
            } else {
                System.out.println("Враг повержен");
            }
        }
    }

    public void selectMag() {
        inputName();
        Mag mag = new Mag("", 100);
        System.out.println("Куда отправимся ?");
        dungeons.dungeonList();
        inputChoice();
        if (inputChoice == 1) {
            skeleton.startBattleMessage();
            while (mag.getHealth() > 0 && skeleton.getHealth() > 0) {
                System.out.printf("HP %s: %s\n", mag.getName(), mag.getHealth());
                System.out.printf("HP врага: %s\n\n", skeleton.getHealth());
                mag.skillList();
                System.out.println("\n");
                inputChoice();

                if (inputChoice == 5) {
                    mag.skillDescription();
                } else if (inputChoice == 1) {
                    mag.attackEnemy(skeleton);
                    skeleton.attackHero(mag);
                } else if (inputChoice == 2) {
                    mag.dragonFire(skeleton);
                    skeleton.attackHero(mag);
                } else if (inputChoice == 3) {
                    mag.poisonFog(skeleton);
                    skeleton.attackHero(mag);
                } else if (inputChoice == 4) {
                    if (mag.defend(skeleton)) {
                        System.out.println("---" + skeleton.getName() + " промахнулся---");
                    } else {
                        skeleton.attackHero(mag);
                    }
                } else {
                    System.out.println("Неверный ввод");
                }
            }
            if (mag.getHealth() <= 0 && (!skeleton.isAlive())) {
                System.out.println("Герой и враг оба погибли\nGAME OVER");
            } else if (skeleton.isAlive()) {
                mag.death();
            } else {
                System.out.println("Враг повержен");
            }
        }
    }

    public int getInputChoice() {
        return inputChoice;
    }
}
