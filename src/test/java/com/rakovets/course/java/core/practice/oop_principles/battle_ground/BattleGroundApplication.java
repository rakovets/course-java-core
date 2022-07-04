package com.rakovets.course.java.core.practice.oop_principles.battle_ground;
public class BattleGroundApplication {
    public static void main(String[] args) {
        Mag magik = new Mag("San", 100);
        Archer archer = new Archer("Ivan", 100);
        Warrior warrior = new Warrior("Stepan", 100);
        Tenebrarum tenebrarum = new Tenebrarum(100);
        Zombie vasgen = new Zombie(100);

        magik.attackEnemy(tenebrarum);
        System.out.printf("%s - screaming 'Mag', %s - 'Tenebrarum' apply damage.\n\n", magik.attackEnemy(), tenebrarum.getHealth());
        archer.attackEnemy(tenebrarum);
        System.out.printf("%s - screaming 'Archer', %s - 'Tenebrarum' apply damage.\n\n", archer.attackEnemy(), tenebrarum.getHealth());
        warrior.attackEnemy(tenebrarum);
        System.out.printf("%s - screaming 'Warrior', %s - 'Tenebrarum' apply damage.\n\n", warrior.attackEnemy(), tenebrarum.getHealth());
        magik.attackEnemy(vasgen);
        System.out.printf("%s - screaming 'mag', %s - 'Zombie' apply damage.\n\n", magik.attackEnemy(), vasgen.getHealth());
        archer.attackEnemy(vasgen);
        System.out.printf("%s - screaming 'archer', %s - 'Zombie' apply damage.\n\n", archer.attackEnemy(), vasgen.getHealth());
        warrior.attackEnemy(vasgen);
        System.out.printf("%s - screaming 'warrior', %s - 'Zombie' apply damage.\n\n", warrior.attackEnemy(), vasgen.getHealth());
        tenebrarum.attackHero(magik);
        System.out.printf("attack 'Tenebrarum' %s - 'Mag' apply damage\n\n", magik.getHealth());
        tenebrarum.attackHero(archer);
        System.out.printf("attack 'Tenebrarum'  %s - 'Archer' apply damage\n\n", archer.getHealth());
        tenebrarum.attackHero(warrior);
        System.out.printf("attack 'Tenebrarum'  %s - 'Warrior' apply damage\n\n", warrior.getHealth());
        vasgen.attackHero(magik);
        System.out.printf("attack 'Zombie'- %s  'Mag' apply damage\n\n", magik.getHealth());
        vasgen.attackHero(archer);
        System.out.printf("attack 'Tenebrarum'  %s - 'Archer' apply damage\n\n", archer.getHealth());
        vasgen.attackHero(warrior);
        System.out.printf("attack 'Tenebrarum'  %s - 'Warrior' apply damage\n\n", warrior.getHealth());
        System.out.printf("%s- 'Zombie' life after resurrection \n\n", vasgen.getHealth());
        System.out.printf("%s 'Tenebrarum' life after resurrection \n\n", tenebrarum.getHealth());
    }
}
