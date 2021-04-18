package com.rakovets.course.java.core.practice.oop.principles.battle_ground_homework;

public class HeroTest {
    public static void main(String[] args) {


        Undead undead = new Undead (80);
        Archer archer = new Archer("EyeShooter", 100);
        Mag mag = new Mag ("Gendalf",80);
// Enemy(Undead) VS Hero(Archer) Demo:
        System.out.println("Archer health: " + archer.getHealthPoint());
        System.out.println("undead health: "+ undead.getHealth());
        undead.UndeadVampiricSkill(archer, undead);
        System.out.println("Archer health after vampiric: " + archer.getHealthPoint());
        System.out.println("undead health after vampiric: "+ undead.getHealth());
        undead.attackHero(archer);
        System.out.println("Archer health after attack: " + archer.getHealthPoint());
        undead.attackHero(archer);
        undead.attackHero(archer);
        undead.attackHero(archer);
        undead.attackHero(archer);
        undead.attackHero(archer);
        undead.UndeadVampiricSkill(archer, undead);
        System.out.println("Is archer Alive? " + archer.isAlive());
// Enemy(Undead) VS Hero(Mag) Demo:
        System.out.println("\nMag health: " + mag.getHealthPoint());
        System.out.println("undead health: "+ undead.getHealth());
        undead.UndeadVampiricSkill(mag, undead);
        undead.attackHero(mag);
        System.out.println("Mag health after undead attack: " + mag.getHealthPoint());
        System.out.println("undead health after vampiric: "+ undead.getHealth());
        System.out.println("\nGendalf Says: you shell not pass");
        mag.attackEnemy(undead);
        mag.attackEnemy(undead);
        System.out.println("Is undead Alive? " + undead.isAlive());
        mag.magSkillAttackEnemy(undead);
        System.out.println("Gendalf Says: Hasta la vista, baby");
        System.out.println("Is undead Alive? " + undead.isAlive());

        Orc orc = new Orc(100);
        Warrior warrior = new Warrior ("Tim",100);
        System.out.println("\nWarrior health: " + warrior.getHealthPoint());
        System.out.println("Orc health: "+ orc.getHealth());
        orc.attackHero(warrior);
        orc.OrcSkillAttackHero(warrior);
        warrior.attackEnemy(orc);
        warrior.warriorSkillAttackEnemy(orc);
        System.out.println("Warrior health after attack: " + warrior.getHealthPoint());
        System.out.println("Orc health after attack: "+ orc.getHealth());
        orc.isAlive();
        warrior.isAlive();
















    }
}
