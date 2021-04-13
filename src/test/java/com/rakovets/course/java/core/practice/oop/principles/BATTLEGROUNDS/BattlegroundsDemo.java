package com.rakovets.course.java.core.practice.oop.principles.BATTLEGROUNDS;
import com.rakovets.course.java.core.practice.oop.principles.BATTLEGROUNDS.*;
public class BattlegroundsDemo {
    public static void main(String[] args) {
        Hero hero = new Archer("war",100);
        Enemy enemy = new Beast(1000);
        System.out.printf("ur start hp %s\n",hero.getHealth());
        System.out.printf("start hp of ur enemy %s\n",enemy.getHealth());
        for (int i = 0; enemy.health > 0 && hero.health > 0; i++){
            hero.attackEnemy(enemy);
            System.out.printf("health of ur enemy %s\n",enemy.getHealth());
            enemy.attackEnemy(hero);
            System.out.printf("ur health %s\n",hero.getHealth());
            enemy.isAlive();
            hero.die(hero.getHealth());
        }
    }


}
