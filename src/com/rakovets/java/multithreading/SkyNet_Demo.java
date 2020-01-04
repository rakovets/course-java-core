package com.rakovets.java.multithreading;

public class SkyNet_Demo {
	public static void main(String[] args) {
		SkyNet_Factory factory = new SkyNet_Factory();

		for (int i = 0; i < 100; i++) {
			new Thread(new SkyNet_ProducerDetails(factory), "Рабочий").start();
			try {
				Thread.sleep(10);
			} catch (InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
			new Thread(new SkyNet_World(factory), "Фракция \"World\"").start();
			try {
				Thread.sleep(10);
			} catch (InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
			new Thread(new SkyNet_Wednesday(factory), "Фракция \"Wednesday\"").start();
			try {
				Thread.sleep(10);
			} catch (InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
		int robotsWorld = factory.counterRobots(factory.headCounterWorld, factory.torsoCounterWorld,
				factory.handsCounterWorld, factory.feetCounterWorld);
		int robotsWednesday = factory.counterRobots(factory.headCounterWednesday, factory.torsoCounterWednesday,
				factory.handsCounterWednesday, factory.feetCounterWednesday);
		System.out.printf("\nИтог: <World> - %d роботов, <Wednesday> - %d роботов\n", robotsWorld, robotsWednesday);
		if (robotsWorld > robotsWednesday) {
			System.out.println("\u001B[32mПобедитель - фракция <World> !!!");
		} else if (robotsWorld < robotsWednesday) {
			System.out.println("\u001B[32mПобедитель - фракция <Wednesday> !!!");
		} else {
			System.out.println("\u001B[32mНет победителей в этой войне!!!");
		}
	}
}