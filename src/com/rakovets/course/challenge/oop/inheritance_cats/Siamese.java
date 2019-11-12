package com.rakovets.course.challenge.oop.inheritance_cats;

class Siamese extends Cat {
	private int positiveInfluence = 30;
	private int negativeInfluence = -30;

	Siamese(String name) {
		super(name);
	}

	@Override
	void mew(Person person) {
		System.out.printf("%s cat say: <<<mew-mew-mew>>> -30%% happiness\n", getName());
		person.takeHappiness(negativeInfluence);
	}

	@Override
	void purr(Person person) {
		System.out.printf("%s cat say: <<<purr-purr-purr>>> +30%% happiness\n", getName());
		person.takeHappiness(positiveInfluence);
	}
}
