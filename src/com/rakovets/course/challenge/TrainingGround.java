package com.rakovets.course.challenge;

public class TrainingGround {
    public static void main(String[] args) {

        Enemy enemy = new Enemy(200, "enemy");
        System.out.println("Enemies health before fight: " + enemy.getHealth());

        Archer archer = new Archer("ARCHER", 200);
        System.out.println("Archers name: " + archer.getName());
        archer.attackEnemy(enemy);

        Warrior warrior = new Warrior("WARRIOR", 100);
        System.out.println("Warriors name: " + warrior.getName());
        warrior.attackEnemy(enemy);

        Mag mag = new Mag("MAG", 300);
        System.out.println("Mags name: " + mag.getName());
        mag.attackEnemy(enemy);

        System.out.println("Enemies health after fight: " + enemy.getHealth());
    }
}
