package com.rakovets.course.challenge.oop.polymorphism_battleGround;

public abstract class Enemy implements Mortal {
	String name;
	int health;
	int damage;
	int restoreLife = 1;

	public Enemy(String name, int health, int damage) {
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

	void takeDamage(int damage) {
		setHealth(health -= damage);
		if (health > 0) {
			System.out.printf("%s ----- [ %d%% health ] ----- ( alive - %s ) \n", getName(), getHealth(), isAlive());
		} else {
			System.out.printf("%s ----- [ is DEAD ] ----- ( alive - %s ) \n\n", getName(), isAlive());
			if (getName().equals("<ZOMBIE>") && restoreLife == 1) {
				setHealth(100);
				System.out.printf("%s Restore Life!!! - [ %d%% health ] ----- ( alive - %s ) \n", getName(), getHealth(), isAlive());
				restoreLife--;
			}
		}
	}

	public boolean isAlive() {
		boolean alive = this.health > 0 ? true : false;
		return alive;
	}

}
