package com.rakovets.course.challenge.oop.inheritance_cats;

class Persian extends Cat {
	private int positiveInfluence = 50;
	private int negativeInfluence = -50;

	Persian(String name) {
		super(name);
	}

	@Override
	void mew(Person person) {
		System.out.printf("%s cat say: <<<meeeeew>>> -50%% happiness\"\n", getName());
		person.takeHappiness(negativeInfluence);
	}

	@Override
	void purr(Person person) {
		System.out.printf("%s cat say: \"<<<puuuuurr>>> +50%% happiness\"\n", getName());
		person.takeHappiness(positiveInfluence);
	}
}
