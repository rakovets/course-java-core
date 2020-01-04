package com.rakovets.java.multithreading;

import java.util.LinkedList;
import java.util.Random;

public class SkyNet_Factory {
	LinkedList<String> detailsFactory = new LinkedList();
	int headCounterWorld = 0;
	int torsoCounterWorld = 0;
	int handsCounterWorld = 0;
	int feetCounterWorld = 0;

	int headCounterWednesday = 0;
	int torsoCounterWednesday = 0;
	int handsCounterWednesday = 0;
	int feetCounterWednesday = 0;

	Random random = new Random();
	int counterDays = 0;

	synchronized void makeDetails() {
		counterDays += 1;
		System.out.printf("\nДень %d\n", counterDays);
		while (detailsFactory.size() > 0) {
			try {
				wait();
			} catch (InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}

		for (int i = 0; i < 10; i++) {
			switch (random.nextInt(4)) {
				case 0:
					detailsFactory.add("head");
					break;
				case 1:
					detailsFactory.add("torso");
					break;
				case 2:
					detailsFactory.add("hands");
					break;
				case 3:
					detailsFactory.add("feet");
					break;
			}
		}
		System.out.printf("%s изготовил 10 деталей: %s\n", Thread.currentThread().getName(), detailsFactory);
	}

	synchronized void getDetailsWorld() {
		while (detailsFactory.size() < 0) {
			try {
				wait();
			} catch (InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
		for (int i = 0; i < 5; i++) {
			switch (detailsFactory.getFirst()) {
				case "head":
					headCounterWorld += 1;
					detailsFactory.removeFirst();
					break;
				case "torso":
					torsoCounterWorld += 1;
					detailsFactory.removeFirst();
					break;
				case "hands":
					handsCounterWorld += 1;
					detailsFactory.removeFirst();
					break;
				case "feet":
					feetCounterWorld += 1;
					detailsFactory.removeFirst();
					break;
			}
		}
	}

	synchronized void getDetailsWednesday(int counter) {
		while (detailsFactory.size() < 0) {
			try {
				wait();
			} catch (InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
		for (int i = 0; i < 5; i++) {
			switch (detailsFactory.getFirst()) {
				case "head":
					headCounterWednesday += 1;
					detailsFactory.removeFirst();
					break;
				case "torso":
					torsoCounterWednesday += 1;
					detailsFactory.removeFirst();
					break;
				case "hands":
					handsCounterWednesday += 1;
					detailsFactory.removeFirst();
					break;
				case "feet":
					feetCounterWednesday += 1;
					detailsFactory.removeFirst();
					break;
			}
		}
	}

	int counterRobots(int head, int torso, int hands, int feet) {
		int robots = Math.min(Math.min(head, torso), Math.min(hands, feet));
		return robots;
	}
}