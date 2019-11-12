package com.rakovets.course.challenge.oop.polymorphism_battleGround;

public class BattleGround {
	public static void main(String[] args) {
		Warrior warrior = new Warrior("<Warrior>", 100, 40);
		Mag mag = new Mag("<Mag>", 100, 30);
		Archer archer = new Archer("<Archer>", 100, 20);

		Zombie zombie = new Zombie("<ZOMBIE>", 100, 30);
		Skeleton skeleton = new Skeleton("<SKELETON>", 100, 20);

		warrior.attackEnemy(skeleton);
		warrior.attackEnemy(skeleton);
		warrior.attackEnemy(skeleton);
		warrior.attackEnemy(zombie);
		warrior.attackEnemy(zombie);
	}
}
