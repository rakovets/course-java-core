package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class ProgramBattle {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Warrior ivan = new Warrior("Shrek");
        ivan.setHeath(150);
        Zoomby zoomby = new Zoomby(150);
        System.out.println(ANSI_GREEN + "Zoombe has " + zoomby.getHealth() + "-----Hero has " + ivan.getHealth() + ANSI_RESET);
        for (int i = 0; zoomby.getHealth() > 0; i++) {
            ivan.attackEnemy(zoomby);
            System.out.println(ANSI_GREEN + "Zoombe has " + zoomby.getHealth() + ANSI_RESET);
            if (zoomby.getHealth() > 0) {
                zoomby.attackHero(ivan);
                System.out.println(ANSI_RED + "Hero has " + ivan.getHealth() + ANSI_RESET);
                if (ivan.getHealth() > 0) {
                    System.out.println("Next step");
                } else
                    break;
                System.out.println(ANSI_RED + "Hero is dead with " + ivan.getHealth() + ANSI_RESET);


            } else System.out.println(ANSI_RED + "Enemy is dead with " + zoomby.getHealth() + ANSI_RESET);
        }


        // enemy.attackHero(ivan);


        // System.out.print(ANSI_GREEN + ivan.attackEnemy(zoomby)+ ANSI_RESET);
        //     Mag magic = new Mag("Gendolf");
        //     magic.attackEnemy();
        //    Archer robin = new Archer("Robin Good");
        //    robin.attackEnemy();
        //     Enemy unit1 = new Enemy(100);

    }
}
