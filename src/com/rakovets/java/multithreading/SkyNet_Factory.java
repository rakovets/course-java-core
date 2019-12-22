package com.rakovets.java.multithreading;

import java.util.LinkedList;
import java.util.Random;

public class SkyNet_Factory {
	LinkedList<String> detailsFactory = new LinkedList();
	Random random = new Random();

	void producer() {
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
	}

	synchronized String consumer() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		String detail = detailsFactory.getFirst();
		detailsFactory.removeFirst();
		notify();
		return detail;
	}
}