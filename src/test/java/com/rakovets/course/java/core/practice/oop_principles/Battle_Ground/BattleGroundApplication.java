package com.rakovets.course.java.core.practice.oop_principles.Battle_Ground;

public class BattleGroundApplication {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Stepan");
        Archer archer = new Archer("Ivan");
        Mag mag = new Mag("San");

        System.out.printf("%s - name warrior. %s - screaming warrior.\n\n", warrior.getName(), warrior.attackEnemy());
        System.out.printf("%s - name archer. %s - screaming archer.\n\n", archer.getName(), archer.attackEnemy());
        System.out.printf("%s - name mag. %s - screaming archer.\n\n", mag.getName(), mag.attackEnemy());

        Enemy enemy = new Enemy(100);

        warrior.attackEnemy(enemy);
        System.out.printf("%s - screaming 'warrior', %s - apply damage.\n\n",warrior.attackEnemy(), enemy.getHealth());
        archer.attackEnemy(enemy);
        System.out.printf("%s - screaming 'archer', %s - apply damage.\n\n",archer.attackEnemy(), enemy.getHealth());
        mag.attackEnemy(enemy);
        System.out.printf("%s - screaming 'archer', %s - apply damage.\n\n",mag.attackEnemy(), enemy.getHealth());



    }
}
