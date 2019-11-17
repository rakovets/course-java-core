package com.rakovets.course.challenge.oopInheritanceAndPolymorphism;

public class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("John");
        System.out.println(hero.toString());
        System.out.println("Hero's name: " + hero.getName());
        hero.attackEnemy();

        Hero mac = new Warrior("Mac");
        mac.attackEnemy();

        Hero harry = new Mag("Harry");
        harry.attackEnemy();

        Hero jack = new Archer("Jack");
        jack.attackEnemy();

        Enemy zombie = new Enemy(100);
        System.out.println(zombie.toString());

        jack.attackEnemy(zombie);

        System.out.println(zombie.toString());
        mac.attackEnemy(zombie);
        System.out.println(zombie.toString());
        harry.attackEnemy(zombie);
        System.out.println(zombie.toString());
        jack.attackEnemy(zombie);

        while(zombie.isAlive()){
            harry.attackEnemy();
        }
        System.out.println(zombie.toString());

    }
}
