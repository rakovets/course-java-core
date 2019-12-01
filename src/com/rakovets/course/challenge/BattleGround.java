package com.rakovets.course.challenge;

import javafx.scene.shape.Arc;

public class BattleGround {
    public static void main(String[] args) {

        Shadow shade = new Shadow(400, "Shade");

        HealingEnemy healingEnemy = new HealingEnemy(1000, "healer");

        PoisonEnemy poisonEnemy = new PoisonEnemy(1000, "poison");


        Mag superMag = new Mag("Magician", 4000);

        System.out.println("Здоровье мага до боя: " + superMag.health);
        System.out.println("Здоровье тени до боя: " + shade.health);
        System.out.println("Здоровье ядовитого врага до боя: " + poisonEnemy.health);
        System.out.println("Здоровье врага с регенерацией до боя: " + healingEnemy.health);

        superMag.attackEnemy(shade);
        shade.attackHero(superMag);
        superMag.attackEnemy(healingEnemy);
        healingEnemy.attackHero(superMag);
        superMag.attackEnemy(poisonEnemy);
        poisonEnemy.attackHero(superMag);

        System.out.println("Здоровье мага после боя: " + superMag.health);
        System.out.println("Здоровье тени после боя: " + shade.health);
        System.out.println("Здоровье ядовитого врага после боя: " + poisonEnemy.health);
        System.out.println("Здоровье врага с регенерацией после боя: " + healingEnemy.health);
    }
}
