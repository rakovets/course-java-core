package com.rakovets.course.challenge.oop.polymorphism_battleGround;

public class Skeleton extends Enemy {
	public Skeleton(String name, int health, int damage) {
		super(name, health, damage);
		System.out.printf("%s --- [ %d%% health ] ----- ( alive - %s ) \n\n", getName(), getHealth(), isAlive());
	}
}
