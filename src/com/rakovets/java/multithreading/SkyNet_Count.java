package com.rakovets.java.multithreading;

import java.util.List;

public class SkyNet_Count {
	private int headWorld;
	private int torsoWorld;
	private int handsWorld;
	private int feetWorld;
	private int headWednesday;
	private int torsoWednesday;
	private int handsWednesday;
	private int feetWednesday;

	void countWorld(String m) {
		switch (m) {
			case "head":
				headWorld = headWorld + 1;
				break;
			case "torso":
				torsoWorld = torsoWorld + 1;
				break;
			case "hands":
				handsWorld = handsWorld + 1;
				break;
			case "feet":
				feetWorld = feetWorld + 1;
				break;
		}
		System.out.printf("\u001B[31m World Head: %-15d   World Torso: %-15d   World Hands: %-15d   World Feet: %d\n",
				headWorld, torsoWorld, handsWorld, feetWorld);

		System.out.println("\u001B[31m Count Robots World: " + List.of(headWorld, torsoWorld, handsWorld, feetWorld)
				.stream().min(Integer::compareTo));
	}

	void countWednesday(String m) {
		switch (m) {
			case "head":
				headWednesday = headWednesday + 1;
				break;
			case "torso":
				torsoWednesday = torsoWednesday + 1;
				break;
			case "hands":
				handsWednesday = handsWednesday + 1;
				break;
			case "feet":
				feetWednesday = feetWednesday + 1;
				break;

		}
		System.out.printf("\u001B[32m Wednesday Head: %-11d   Wednesday Torso: %-11d   Wednesday Hands: %-11d   Wednesday Feet: %d\n",
				headWednesday, torsoWednesday, handsWednesday, feetWednesday);

		System.out.println("\u001B[32m Count Robots Wednesday: " + List.of(headWednesday, torsoWednesday, handsWednesday, feetWednesday)
				.stream().min(Integer::compareTo));
	}
}