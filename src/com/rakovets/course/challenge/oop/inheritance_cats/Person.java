package com.rakovets.course.challenge.oop.inheritance_cats;

class Person {
	int happiness;

	public Person(int happiness) {
		this.happiness = happiness;
		System.out.printf("Happiness Person = %d%%\n", getHappiness());
	}

	void takeHappiness(int happiness) {
		this.happiness += happiness;
		if (this.happiness <= 0) {
			setHappiness(0);
			System.out.printf("Happiness Person = %d%%\n", getHappiness());
			System.out.println("!!! DEPRESSION !!!");
		} else if (this.happiness >= 100) {
			setHappiness(100);
			System.out.printf("Happiness Person = %d%%\n", getHappiness());
			System.out.println("~ ~ ~ ZEN ~ ~ ~");
		} else {
			System.out.printf("Happiness Person = %d%%\n", getHappiness());
		}
	}

	public int getHappiness() {
		return this.happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}
}
