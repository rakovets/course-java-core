package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class ProgramBattle {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Warrior ivan = new Warrior("Shrek");
        ivan.setHeath(200);
        Zoomby zoomby = new Zoomby(150);
        System.out.println(ANSI_GREEN + "Zoombe has " + zoomby.getHealth() + ANSI_RESET + "-----" + ANSI_RED + "Hero has " + ivan.getHealth() + ANSI_RESET);

        for (int i = 0; zoomby.isAlive(); i++) {
            System.out.println("----------------");
            ivan.attackEnemy(zoomby);
            System.out.println(ANSI_GREEN + "Zoombe has " + zoomby.getHealth() + ANSI_RESET);
            if (zoomby.isAlive()) {
                zoomby.attackHero(ivan);
                System.out.println(ANSI_RED + "Hero has " + ivan.getHealth() + ANSI_RESET);
                if (!ivan.isAlive()) {
                    System.out.println(ANSI_RED + "Hero is dead with " + ivan.getHealth() + ANSI_RESET);
                    System.out.println("----------------");
                    break;
                }
            } else {
                System.out.println(ANSI_RED + "Enemy is dead with " + zoomby.getHealth() + ANSI_RESET);
                System.out.println("----------------");
            }
        }
    }
}
