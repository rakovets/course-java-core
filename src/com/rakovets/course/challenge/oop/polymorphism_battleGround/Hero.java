package com.rakovets.course.challenge.oop.polymorphism_battleGround;

public abstract class Hero {
	String name;
	int health;
	int damage;

	public Hero(String name, int health, int damage) {
		this.name = name;
		this.health = health;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getDamage() {
		return damage;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void attackEnemy(Enemy enemy) {
		if (getName().equals("<Warrior>") && enemy.getName().equals("<ZOMBIE>")) {
			System.out.printf("For %s ability - up damage x3 \n", getName());
			setDamage(getDamage() * 3);
		}
		System.out.printf("%s attacks %s: DAMAGE -->> %d \n", getName(), enemy.getName(), getDamage());
		enemy.takeDamage(getDamage());
		if (enemy.health > 0) {
			System.out.printf("%s attacks %s: DAMAGE -->> %d \n", enemy.getName(), getName(), enemy.getDamage());
			setHealth(getHealth() - enemy.getDamage());
			if (getHealth() > 0) {
				System.out.printf("%s ---- [ %d%% health ] ----- ( alive - %s ) \n\n", getName(), getHealth(), isAlive());
			} else {
				System.out.printf("%s ----- [ is DEAD ] ----- ( alive - %s ) \n\n", getName(), isAlive());
			}
		}
		if (getName().equals("<Warrior>") && enemy.getName().equals("<ZOMBIE>")) {
			setDamage(getDamage() / 3);
		}
	}

	public boolean isAlive() {
		boolean alive = this.health > 0 ? true : false;
		return alive;
	}
}
