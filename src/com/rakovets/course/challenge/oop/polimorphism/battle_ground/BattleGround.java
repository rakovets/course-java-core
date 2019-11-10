package com.rakovets.course.challenge.oop.polimorphism.battle_ground;

public class BattleGround {
    public static void main(String[] args) {
        Warrior war1 = new Warrior("Kris", 50);
        Zombie enem1 = new Zombie(30);
        war1.attacEnemy(enem1);
        enem1.attackHero(war1);
        Mag hero2 = new Mag("Karl", 20);
        hero2.attacEnemy(enem1);
        enem1.attackHero(hero2);
        Enemy enem2 = new Enemy(30);
        enem2.attackHero(hero2);
        Wolf wolf1 = new Wolf(25);
        war1.attacEnemy(wolf1);
        war1.attacEnemy(wolf1);
    }
}
