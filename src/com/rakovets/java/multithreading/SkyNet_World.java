package com.rakovets.java.multithreading;

public class SkyNet_World implements Runnable {
	SkyNet_Factory factory;

	public SkyNet_World(SkyNet_Factory factory) {
		this.factory = factory;
	}

	@Override
	public void run() {
		factory.getDetailsWorld();
		System.out.printf("%-20s раздобыла %d деталей: Head - %d, Torso - %d, Hands - %d, Feet - %d\n",
				Thread.currentThread().getName(), factory.counterDays * 5, factory.headCounterWorld, factory.torsoCounterWorld,
				factory.handsCounterWorld, factory.feetCounterWorld);
		System.out.printf("%-20s собрала %d роботов.\n", Thread.currentThread().getName(), factory.counterRobots(
				factory.headCounterWorld, factory.torsoCounterWorld, factory.handsCounterWorld, factory.feetCounterWorld));
	}
}