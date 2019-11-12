package com.rakovets.course.challenge.oop.inheritance_cats;

class Sphynx extends Cat {
	private int positiveInfluence = 70;
	private int negativeInfluence = -70;

	Sphynx(String name) {
		super(name);
	}

	@Override
	void mew(Person person) {
		System.out.printf("%s cat say: <<<MEW>>> -70%% happiness\n", getName());
		person.takeHappiness(negativeInfluence);
	}

	@Override
	void purr(Person person) {
		System.out.printf("%s cat say: <<<PURR>>> +70%% happiness\n", getName());
		person.takeHappiness(positiveInfluence);
	}
}
