package com.rakovets.java.multithreading;

public class SkyNet_Wednesday implements Runnable {
	SkyNet_Factory factory;
	int counterDays = 0;

	public SkyNet_Wednesday(SkyNet_Factory factory) {
		this.factory = factory;
	}

	@Override
	public void run() {
		counterDays += 1;
		factory.getDetailsWednesday(counterDays);
		System.out.printf("%-20s раздобыла %d деталей: Head - %d, Torso - %d, Hands - %d, Feet - %d\n",
				Thread.currentThread().getName(), factory.counterDays * 5, factory.headCounterWednesday,
				factory.torsoCounterWednesday, factory.handsCounterWednesday, factory.feetCounterWednesday);
		System.out.printf("%-20s собрала %d роботов.\n", Thread.currentThread().getName(), factory.counterRobots(
				factory.headCounterWednesday, factory.torsoCounterWednesday, factory.handsCounterWednesday,
				factory.feetCounterWednesday));
	}
}