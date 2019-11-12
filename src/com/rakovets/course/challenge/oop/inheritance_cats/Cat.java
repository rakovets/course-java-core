package com.rakovets.course.challenge.oop.inheritance_cats;

abstract class Cat {
	String name;

	Cat(String name) {
		this.name = name;
	}

	void mew(Person person) {
		System.out.printf("%s <<<mew>>>\n", getName());
		person.takeHappiness(-20);
	}

	void purr(Person person) {
		System.out.printf("%s <<<purr>>>\n", getName());
		person.takeHappiness(20);
	}

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}
}